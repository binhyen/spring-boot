package com.springboot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.output.NewsOutput;
import com.springboot.dto.NewsDTO;
import com.springboot.entity.NewsEntity;
import com.springboot.service.INewsService;

@RestController
public class NewsAPI {

	@Autowired
	private INewsService newsService;

//	@GetMapping(value = "/api/news")
//	public List<NewsDTO> getNews() {
//		return newsService.findAll();
//	}

	@GetMapping(value = "/api/news")
	public NewsOutput showNews(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "limit", required = false) Integer limit) {
		NewsOutput result = new NewsOutput();
		if (page == null || limit == null) {
			result.setListResult(newsService.findAll());
		} else {
			result.setPage(page);
			result.setListResult(newsService.findAll(new PageRequest(page - 1, limit)));
			result.setTotalPage((int) Math.ceil(((double) newsService.totalItem())/limit));
		}
		
		return result;
	}

	@PostMapping(value = "/api/news")
	public NewsDTO createNews(@RequestBody NewsDTO model) {
		return newsService.save(model);
	}

	@PutMapping(value = "/api/news/{id}")
	public NewsDTO updateNews(@RequestBody NewsDTO model, @PathVariable("id") long id) {
		model.setId(id);
		return newsService.save(model);
	}

	@DeleteMapping(value = "/api/news")
	public void deleteNews(@RequestBody long[] ids) {
		System.out.println("delete");
		newsService.delete(ids);
	}
}

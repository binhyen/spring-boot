package com.springboot.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.springboot.dto.NewsDTO;

public interface INewsService {
	NewsDTO save(NewsDTO newsDTO);

	List<NewsDTO> findAll();
	
	List<NewsDTO> findAll(Pageable pageable);

	void delete(long[] ids);
	
	int totalItem();
}

package com.springboot.converter;

import org.springframework.stereotype.Component;

import com.springboot.dto.NewsDTO;
import com.springboot.entity.NewsEntity;

@Component
public class NewsConverter {
	public NewsEntity toEntity(NewsDTO dto) {
		NewsEntity entity = new NewsEntity();
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setThumbnail(dto.getThumbnail());
		entity.setShortDescription(dto.getShortDescription());
		return entity;
	}
	
	public NewsEntity toEntity(NewsDTO dto, NewsEntity entity) {
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setThumbnail(dto.getThumbnail());
		entity.setShortDescription(dto.getShortDescription());
		return entity;
	}
	
	public NewsDTO toDTO(NewsEntity entity) {
		NewsDTO dto = new NewsDTO();
		if (entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setTitle(entity.getTitle());
		dto.setContent(entity.getContent());
		dto.setThumbnail(entity.getThumbnail());
		dto.setShortDescription(entity.getShortDescription());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setModifiedDate(entity.getModifiedDate());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setModifiedBy(entity.getModifiedBy());
		return dto;
	}
}

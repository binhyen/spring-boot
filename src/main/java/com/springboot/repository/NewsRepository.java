package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.NewsEntity;

@Repository
public interface NewsRepository extends JpaRepository<NewsEntity, Long>{

}

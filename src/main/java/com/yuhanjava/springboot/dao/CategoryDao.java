package com.yuhanjava.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuhanjava.springboot.pojo.Category;

public interface CategoryDao extends JpaRepository<Category,Integer>{
	
}


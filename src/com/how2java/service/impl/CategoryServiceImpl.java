package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	@Override
	public List<Category> list(){
		return categoryMapper.list();
	}

	@Override
	public void add(Category c) {
		categoryMapper.add(c);
		
	}

	@Override
	public void delete(int id) {
		categoryMapper.delete(id);
		
	}

}

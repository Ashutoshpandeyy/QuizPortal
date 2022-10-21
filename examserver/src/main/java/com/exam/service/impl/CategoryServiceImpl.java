package com.exam.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.exam.Category;
import com.exam.repo.CategoryRepository;
import com.exam.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	//add category
	@Override
	public Category addCategory(Category category) {
		
		return this.categoryRepository.save(category);
	}

	//updating the category
	@Override
	public Category updateCategory(Category category) {
	
		return this.categoryRepository.save(category);
	}

	// get all category
	@Override
	public Set<Category> getCategories() {
		
		return new LinkedHashSet<>(this.categoryRepository.findAll());
	}

	// get specific category
	@Override
	public Category getCategory(Long categoryId) {
		
		return this.categoryRepository.findById(categoryId).get();
	}

	// delete category
	@Override
	public void deleteCategory(Long categoryId) {
		Category category = new Category();
		category.setCid(categoryId);
		this.categoryRepository.delete(category);
		
		
	}

}

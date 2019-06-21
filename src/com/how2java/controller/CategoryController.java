package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;

// ����spring mvc����һ����������
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page){
		ModelAndView mav = new ModelAndView();
		PageMethod.offsetPage(page.getStart(),5);
		List<Category> cs= categoryService.list();
		int total = (int) new PageInfo<>(cs).getTotal();
		
		page.caculateLast(total);
		
		// ����ת������
		mav.addObject("cs", cs);
		// ����jsp·��
		mav.setViewName("listCategory");
		return mav;
	}
	
	@RequestMapping("addCategory")
	public ModelAndView addCategory(Category category){
		categoryService.add(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}
	
	@RequestMapping("deleteCategory")
	public ModelAndView addCategory(int id){
		categoryService.delete(id);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}
	

}

package com.how2java.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuhanjava.springboot.dao.CategoryDao;
import com.yuhanjava.springboot.pojo.Category;

@Controller
public class CategoryController {
	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping("/listCategory")
	public String listCategory(Model m) throws Exception {
        List<Category> cs=categoryDao.findAll();
         
        m.addAttribute("cs", cs);
         
        return "listCategory";
	}
}

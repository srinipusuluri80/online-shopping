package com.srinivas.onlineshopping.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srinivas.shoppingbackend.dao.CategoryDAO;

@Controller
public class PageController {
	

    @Autowired
	private CategoryDAO categoryDAO;
	
    
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title","Home");
		modelAndView.addObject("categories",categoryDAO.list());
		
		modelAndView.addObject("userClickHome",true);
		return modelAndView;
	}
	@RequestMapping(value = "/about")
	public ModelAndView about() {

		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title","About Us");
		modelAndView.addObject("userClickAbout",true);
		return modelAndView;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {

		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title","Contact Us");
		modelAndView.addObject("userClickContact",true);
		return modelAndView;
	}
	/*@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {

		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title","All Products");
		modelAndView.addObject("categories",categoryDAO.list());
		modelAndView.addObject("userClickAllProducts",true);
		return modelAndView;
	}
*/


}

package com.niit.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.Productdao;
import com.niit.model.Product;


@Controller
public class AdminController {
@Autowired 
	Productdao productdao;
	@RequestMapping("/pro")
	public ModelAndView productpa()
	{
	ModelAndView obj=new ModelAndView("product");
	obj.addObject("p", new Product());
		return obj;
	}
	@RequestMapping(value="/insertproduct")
	public String insertpro(Product p)
	{
		
		productdao.insertProduct(p);
		return "redirect:/pro";
	}
	
	
	
}




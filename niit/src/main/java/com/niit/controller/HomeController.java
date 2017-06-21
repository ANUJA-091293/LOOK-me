package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.Productdao;


@Controller
public class HomeController {
@Autowired

Productdao prodao;
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView obj=new ModelAndView("index");
		return obj;
	}
	@RequestMapping("/contact")
	public ModelAndView home1()
	{
		ModelAndView obj=new ModelAndView("contactus");
		return obj;
	}
	
	@RequestMapping("/login")
	public ModelAndView homez()
	{
		ModelAndView obj=new ModelAndView("login");
		return obj;
	}
	@RequestMapping("/about")
	public ModelAndView home2()

	{
		ModelAndView obj=new ModelAndView("aboutus");
		return obj;
	}
	
	
	@RequestMapping("/getall")
	public ModelAndView home3()

	{
		ModelAndView obj=new ModelAndView("getallproduct");
		obj.addObject("a", prodao.getAllproduct());
		return obj;
	}
	
	@RequestMapping("/single/{id}")
	public ModelAndView home4(@PathVariable("id")int id)

	{
		ModelAndView obj=new ModelAndView("singleview");
		obj.addObject("p", prodao.getProdID(id));
		return obj;
	}
	@RequestMapping("/catg/{cat}")
	public ModelAndView home5(@PathVariable("cat")String cat)
	{
		ModelAndView obj=new ModelAndView("getbycategory");
		obj.addObject("p",prodao.getProByCategory(cat));
		return obj;
	}
	
	@RequestMapping("/delete/{id}")
	public String home6(@PathVariable("id")int id)
	{
	prodao.deleteproID(id);
	return "redirect:/getall";
	}
	
	@RequestMapping("/brnd/{br}")
	public ModelAndView home6(@PathVariable("br")String br)
	{
		ModelAndView obj=new ModelAndView("getProByBrand");
		obj.addObject("p", prodao.getProByBrand(br));
		return obj;
	}
}

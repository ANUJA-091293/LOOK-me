package com.niit.signinup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.Userdao;
import com.niit.model.Userinfom;

@Controller
public class SigninupController {
@Autowired
    Userdao userdao;
	@RequestMapping("/sign")
	public ModelAndView home()
	{
		ModelAndView obj=new ModelAndView("signup");
		obj.addObject("u", new Userinfom());
		
		return obj;
	}
	@RequestMapping(value="/insertuser")
	public String insertuse(Userinfom u )
	{
		
		userdao.insertUser(u);
		return "redirect:/contact";
		
	}
}



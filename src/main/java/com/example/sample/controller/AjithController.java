package com.example.sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.sample.config.AjithConfig;
import com.example.sample.daoimpl.UserDaoImpl;
import com.example.sample.model.Users;

@RestController
public  class AjithController  {
	
	 

	private Map map;

	@PostMapping("checkUser")
	public ModelAndView handleReque(HttpServletRequest req, HttpServletResponse res)     {
		
		System.out.println("hloo1");
		String email=req.getParameter("email");
		String name2=req.getParameter("password");
		System.out.println("hloo1"+email+ name2);
		String sum=email+name2;
		UserDaoImpl userDao=new UserDaoImpl();
		 List<Users> user=userDao.getUserDetails(email);
		System.out.println(" my name is "+user.toString());
		map = new HashMap();
		map.put("msg", "hi....."+email);
		ModelAndView modelAndView=new ModelAndView("success.jsp",map);
		modelAndView.addObject("result",sum);	

		return modelAndView;
	}
	@PostMapping("check")
	public ModelAndView handleRequer(HttpServletRequest req, HttpServletResponse res)     {
		
		System.out.println("hloo1");
		String name=req.getParameter("email");
		String name2=req.getParameter("n2");
		System.out.println("hloo1"+name+ name2);
		String sum=name+name2;
		map = new HashMap();
		map.put("msg", "hi....."+name);
		ModelAndView modelAndView=new ModelAndView("success.jsp",map);
		modelAndView.addObject("result",sum);	
	
		return modelAndView;
	}



}

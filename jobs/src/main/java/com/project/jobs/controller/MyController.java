package com.project.jobs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.jobs.dao.IMemberDao;

@Controller
public class MyController {
	@Autowired
	IMemberDao dao;
	
	@RequestMapping("/")
	public  String root(){
		dao.reg();
		
		return "index";
	}
}

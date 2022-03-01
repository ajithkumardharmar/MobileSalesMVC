package com.example.sample.config;

import java.util.List;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.example.sample.dao.UserDao;
import com.example.sample.daoimpl.UserDaoImpl;
import com.example.sample.model.Users;



@Configuration
@EnableWebMvc
@ComponentScan({"com.example.sample.controller"})

public class AjithConfig extends WebMvcConfigurerAdapter {
	
//	@Bean(name = "viewResolver")
//	public InternalResourceViewResolver viewResolver() {
//		InternalResourceViewResolver vr=new InternalResourceViewResolver();
//		vr.setSuffix("/WEB-INFO/");
//		vr.setPrefix(".jsp");
//		return vr;
//		
//	}
	


}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Category;
import com.example.demo.domain.Supplier;
import com.example.demo.mapper.Mapper11;

@Controller
@RequestMapping("sub31")
public class Controller31 {

	@Autowired
	private Mapper11 mapper;
	
	// 경로: localhost:8082/sub31/link1?id=3
	@GetMapping("link1")
	public void method1(int id) {
		Category category = mapper.sql1(id);
		
		System.out.println(category);
		category.getProducts().forEach(System.out::println);
	}
	
	// 경로: localhost:8082/sub31/link2?id=3
		@GetMapping("link2")
		public void method2(int id) {
			Category category = mapper.sql2(id);
			
			System.out.println(category);
			category.getProducts().forEach(System.out::println);
		}
		
		@GetMapping("link3")
		public void method(int id) {
			Supplier supplier = mapper.sql3(id);
			
			System.out.println(supplier);
			supplier.getProducts().forEach(System.out::println);
		}
}









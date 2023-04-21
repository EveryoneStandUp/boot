package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub21")
public class Controller21 {

	@Autowired
	private Mapper02 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		/*
		String sql = """
				SELECT CustomerName FROM Customers
				""";
		*/
		List<String> list = mapper.sql1();
		/*
		 List<String> list = new ArrayList<>();
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 while (rs.next()) {
		 	list.add(rs.getString(1));
		 */
//		System.out.println(list);
		list.forEach(System.out::println);
	}
	
	// 경로 : /sub21/link2
	// 모든 직원의 lastName 출력
	@RequestMapping("link2")
	public void method2() {
		List<String> name = mapper.sql2();
		name.forEach(System.out::println);
	}
	
	@RequestMapping("link3")
	public void method3() {
		List<Dto07> names = mapper.sql3();
		names.forEach(System.out::println);
	}
	
	// 모든 상품의 이름, 가격을
	// 조회해서 콘솔에 출력
	// 1) 컨트롤러 메소드
	// 2) 매퍼 메소드
	// 3) Dto08 자바빈

	@RequestMapping("link4")
	public void method4() {
		List<Dto08> list = mapper.sql4();
		list.forEach(System.out::println);
	}
	
	// /sub21/link5?cid=
	@RequestMapping("link5")
	public void method5(@RequestParam("cid") Integer cid) {
		List<String> names = mapper.sql5(cid);
		names.forEach(System.out::println);
	}
	
	// /sub21/link6?country=
	// 각 국가에 있는 고객명이 콘솔에 출력
	// 1) 컨트롤러 메소드
	// 2) 매퍼 메소드
	@RequestMapping("link6")
	public void method6(String country) {
		List<String> names = mapper.sql6(country);
		names.forEach(System.out::println);
	}
	
	@RequestMapping("link7")
	public void method7(Integer cid) {
		mapper.sql7(cid).forEach(System.out::println);;
	}
}






















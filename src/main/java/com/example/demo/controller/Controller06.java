package com.example.demo.controller;

import java.io.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub6")
public class Controller06 {

	@RequestMapping("link1")
	public String method1() {
		System.out.println("link1 메소드 일함");
		return "forward:/sub6/link2";
	}
	
	@RequestMapping("link2")
	public void method2() {
		System.out.println("link2 메소드 일함");
	}
	
	// 경로 : /sub6/link3
	// forward:/sub6/link2
	@RequestMapping("link3")
	public String method3() {
		System.out.println("link3 메소드 일함");
		return "forward:/sub6/link2";
	}
	
	@RequestMapping("link4")
	public void method4(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		System.out.println();
		
		String view = "/WEB-INF/views/abc.jsp";
		req.getRequestDispatcher(view).forward(req, res);
	}
	
	@RequestMapping("link5")
	public String method5() {
		
		System.out.println("link5에서 일함");
		return "forward:/WEB-INF/views/abc.jsp";
	}
	
	@RequestMapping("link6")
	public String method6() {
		System.out.println("link6에서 일함");
		return "abc";
	}
	
	@RequestMapping("link7")
	public String method7() {
		System.out.println("link7에서 일함");
		return "def";
	}
	
	// 경로 : /sub6/link8
	@RequestMapping("link8")
	public String method8() {
		System.out.println("8번 메소드 일함");
		// default view name : /sub6/link8
		return "/sub6/link8";
	}

	// 경로 : /sub6/link9
	@RequestMapping("link9")
	public void method9() {
		System.out.println("9번 메소드 일함");
		// default view name : /sub6/link9
	}
	
	@RequestMapping("link10")
	public String method10() {
		System.out.println("link10 메소드 일함");
		
		return null; // forward default view name
	}
	
//	// 경로 : /sub6/link11
//	// method11 작성
//	// /WEB-INF/views/sub6/link11.jsp로 forward
//	@RequestMapping("link11")
//	public String method11() {
//		System.out.println("link11 메소드 일함");
//	
//		return "/sub6/link11";
//	}
	
	// 경로 : /sub6/link11
	// method11 작성
	// /WEB-INF/views/sub6/link11.jsp로 forward
	@RequestMapping("link11")
	public String method11() {
		System.out.println("link11 메소드 일함");
		
		return null;
	}
	
	// 경로 : /sub6/link12?name=park&age=33
	// 1. request param 수집/가공
	// 2. business logic (생략)
	// 3. add attribute (생략)
	// 4. /WEB-INF/views/sub6/link12.jsp로 포워드
	@RequestMapping("link12")
	public void method12(String name, int age) {
		
	}
	
	
}













package com.example.demo.controller;

import java.time.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub24")
public class Controller24 {

	@Autowired
	private Mapper05 mapper;

	@RequestMapping("link1")
	public void method1() {
		int cnt = mapper.sql1();
		System.out.println(cnt + "개 행 수정됨");
	}
	
	@RequestMapping("link2")
	public void method2() {
		int cnt = mapper.sql2(9, "마이바티스", 98765);
		System.out.println(cnt + "개 행 수정됨");		
	}

	@RequestMapping("link3")
	public void method3() {
		// 10번 고객 이름과 국가가 변경되도록
		// mapper에 sql3 메소드 작성
		int cnt = mapper.sql3(10, "새로운 고객명", "대한민국");
		System.out.println(cnt + "개 행 수정됨");
	}

	@RequestMapping("link4")
	public void method4() {
		
		Customer customer = new Customer();
		customer.setId(9);
		customer.setCity("서울");
		customer.setCountry("대한민국");
		customer.setAddress("신촌");
		customer.setContactName("강백호");
		customer.setName("서태웅");
		customer.setPostalCode("333333");
		
		int cnt = mapper.sql4(customer);
		System.out.println(cnt + "개 행 수정됨");
	}

	@RequestMapping("link5")
	public void method5(Customer customer) {
		int cnt = mapper.sql4(customer);
		System.out.println(cnt + "개 행 수정됨");
	}
	
	// /sub24/link6?id=9
	@RequestMapping("link6")
	public void method6(Integer id, Model model) {
		Customer customer = mapper.sql5(id);
		model.addAttribute("customer", customer);
		
	}
	
	// 직원 조회 및 수정 코드 작성
	@RequestMapping("link7")
	public void method7(Employees employee) {
		int cnt = mapper.sql6(employee);
		System.out.println(employee);
		System.out.println(cnt + "개 행 수정됨");
		
	}

	@RequestMapping("link8")
	public void method8(Integer id, Model model) {
		Employees employee = mapper.sql7(id);
		model.addAttribute("employee", employee);
	}
}






















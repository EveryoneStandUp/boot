package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub22")
public class Controller22 {

	@Autowired
	private Mapper03 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int cnt1 = mapper.sql1(77, "java");
		int cnt2 = mapper.sql1(88, "spring");
		int cnt3 = mapper.sql1(99, "css");
	
		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
	}

	@RequestMapping("link2")
	public void method2() {
		int cnt1 = mapper.sql2(77.777, "kim");
		int cnt2 = mapper.sql2(88.888, "park");
		int cnt3 = mapper.sql2(99.999, "lee");
		
		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
	}
	
	// /sub22/link3?val1=234.223&val2=송태섭
	@RequestMapping("link3")
	public void method3(Double val1, String val2) {
		System.out.println(mapper.sql2(val1, val2));
	}
	
	@RequestMapping("link4")
	public void method4() {
		Dto09 dto = new Dto09();
		dto.setProp1(300);
		dto.setProp2("hello mybatis");
		dto.setProp3(33.33);
		
		int cnt = mapper.sql3(dto);
		System.out.println(cnt);
	}
	
	@RequestMapping("link5")
	public void method5() {
		Dto10 dto = new Dto10();
		dto.setAge(40);
		dto.setName("sebaek");
		dto.setScore(99.99);
		
		System.out.println(mapper.sql4(dto));
	}
	
	// /sub22/link6?age=77&name=park&score=88.88
	@RequestMapping("link6")
	public void method6(@ModelAttribute Dto10 dto) {
		int cnt = mapper.sql4(dto);
		System.out.println(cnt + "개 행 입력됨");
	}

	// MyTable36에 데이터 추가될 수 있게
	// 아래 코드 수정하기
	// /sub22/link7?prop1=24&prop2=sebaek&prop3=33.23
	@RequestMapping("link7")
	public void method7(Dto09 dto) {
		int cnt = mapper.sql3(dto);
		System.out.println(cnt + "개 행 입력됨");
	}
	
	@RequestMapping("link8")
	public void method8() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		dto1.setProp1(345);
		dto2.setName("서태웅");
		dto1.setProp3(99.88);
		
		int cnt = mapper.sql5(dto1, dto2);
		System.out.println(cnt + "개 행 추가됨");
	}
	
	@RequestMapping("link9")
	public void method9() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		dto1.setProp1(333);
		dto2.setAge(42);
		dto1.setProp2("강백호");
		dto2.setName("정대만");
		dto1.setProp3(98.762);
		dto2.setScore(92.423);
		
		int cnt = mapper.sql6(dto1, dto2);
		System.out.println(cnt + "개 행 추가됨");
	}
	
	// /sub22/link10?prop1=7&prop2=lunch&prop3=3.14&age=8&name=son&score=3.14
	@RequestMapping("link10")
	public void method10(Dto09 p1, Dto10 p2) {
		int cnt = mapper.sql6(p1, p2);
		System.out.println(cnt + "개 행 입력!");
	}
	
	// /sub22/link11?prop2=mybatis&prop3=321
	@RequestMapping("link11")
	@ResponseBody
	public String method11(Dto11 dto) {
		System.out.println("prop1: " + dto.getProp1());
		int cnt = mapper.sql7(dto);
		System.out.println(cnt + "개 행 입력!");
		System.out.println("prop1: " + dto.getProp1());
		
		return dto.getProp1() + "번째 데이터 입력완료";
		
	}

	// /sub22/link12?age=40&name=son&score=9.9
	// 요청 시 MyTable40에 데이터 추가되도록 코드 작성
	// 컨트롤러 메소드, 매퍼 메소드, 자바빈
	// 자바빈의 id 프로퍼티에 자동증가컬럼값 받을 수 있게
	@RequestMapping("link12")
	public void method12(Dto12 dto) {
		int cnt = mapper.sql8(dto);
		System.out.println(cnt + "개 행 입력!");
		System.out.println(dto.getId() + "번째 데이터 입력완료"); 
	}
	
}	




























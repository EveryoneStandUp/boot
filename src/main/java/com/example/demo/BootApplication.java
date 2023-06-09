package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.component.ComponentA;
import com.example.demo.component.ComponentC;
import com.example.demo.component.ComponentE;
import com.example.demo.domain.Employees;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		// Spring Beans : 스프링이 관리하는 객체들
		ApplicationContext context = SpringApplication.run(BootApplication.class, args);
		Object o = context.getBean("bean1");
		System.out.println(o);
		
		Object o2 = context.getBean("employee");
		Object o3 = context.getBean("employee");
		System.out.println(o2);
		
		System.out.println(System.identityHashCode(o2));
		System.out.println(System.identityHashCode(o3));
		
		Object o4 = context.getBean("bean2");
		Object o5 = context.getBean("bean3");
		
		System.out.println(o4);
		System.out.println(o5);
		
		ComponentA c1 = (ComponentA) o4;
		System.out.println(c1.getComp());
		ComponentC c3 = (ComponentC) context.getBean("bean4");
		System.out.println(c3.getCom());
		
		Object c4 = context.getBean("componentD");
		System.out.println(c4);
		ComponentE c5 = (ComponentE) context.getBean("componentE");
		System.out.println(c5.getComp());
	}
	
	// 우리가 객체를 직접 만들 때
	public void legacy() {
		Object o = new Object(); // 직접 만든 객체
		Employees e = new Employees(); // 직접 만든 객체
		
		e.setEmployeeId(100); // 프로퍼티 직접 할당
	
	}
	
}

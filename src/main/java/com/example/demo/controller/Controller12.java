package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub12")
public class Controller12 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() {
		String sql = """
				SELECT LastName FROM Employees
				""";
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				System.out.println(rs.next());
				String name1 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next());
				String name2 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next());
				String name3 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next());
				String name4 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next());
				String name5 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next());
				String name6 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next());
				String name7 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next());
				String name8 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next());
				String name9 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next());
				String name10 = rs.getString("lastName");
				System.out.println(name1);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link2")
	public void method2() {
		String sql = """
				SELECT LastName FROM Employees
				""";
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				while (rs.next()) {
					System.out.println(rs.getString("lastName"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SELECT ShipperName FROM Shippers;
	// 경로 : link3
	@RequestMapping("link3")
	public void method3() {
		String sql = """
				SELECT ShipperName FROM Shippers
				""";
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				while (rs.next()) {
					System.out.println(rs.getString("ShipperName"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link4")
		public void method4() {
			String sql = "SELECT * FROM Customers";
		
			try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
				try(con; stmt; rs;) {
					
				while(rs.next()) {
				System.out.println(rs.getString("customerName"));
				System.out.println(rs.getString("contactName"));
				System.out.println(rs.getString("Country"));
				}
			} 
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@RequestMapping("link6")
	public void method6() throws Exception {
		String sql = "SELECT * FROM Products WHERE ProductId <= 3";
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		try (con; stmt; rs;){
		while (rs.next()) {
			System.out.println(rs.getInt("ProductID"));
			System.out.println(rs.getString("ProductName"));
			System.out.println(rs.getDouble("Price"));
			}
		}
	}
	
	// SELECT * FROM Customers WHERE CustomerID < 4
	// CustomerID는 int 타입으로 가져오기
	// CustomerName은 String 타입으로 가져오기
	// 경로 link7
	
	@RequestMapping("link7")
	public void method7() throws Exception {
		String sql = "SELECT * FROM Customers WHERE CustomerID <= 4";
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		try(con; stmt; rs) {
			while (rs.next()) {
				/*
				System.out.println(rs.getInt("CustomerID"));
				System.out.println(rs.getString("CustomerName"));
				*/
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		}
	} 
	
	@RequestMapping("link8")
	public void method8() throws Exception {
		String sql = """
				SELECT FirstName, LastName
				FROM Employees
				WHERE EmployeeID < 4
				""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
	
		try(con; stmt; rs) {
		while (rs.next()) {
			String lastName = rs.getString(2);
			String firstName = rs.getString(1);
		
			System.out.println(lastName + ", " + firstName);
		}
		}
	}
	
	@RequestMapping("link9")
	public void method9() throws Exception {
		// 고객 테이블 조회 쿼리 작성
		String sql = """
				SELECT CustomerID, CustomerName, Country
				FROM Customers
				WHERE CustomerID < 4
				""";		
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		try(con; stmt; rs;) {
		while(rs.next()) {
			int customerId =  rs.getInt(1);
			String customerName = rs.getString(2);
			String country = rs.getString(3);
		
			System.out.println(customerId + ", " + customerName + ", " + country);
			}
		}
	}
}





















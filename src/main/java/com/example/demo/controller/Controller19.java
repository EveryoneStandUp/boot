package com.example.demo.controller;

import java.sql.*;
import java.sql.Date;
import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub19")
public class Controller19 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() throws Exception {
		String sql = """
				INSERT INTO MyTable30 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, 99);
			pstmt.setString(2, "hello");
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	@RequestMapping("link2")
	public void method2() throws Exception {
		String sql = """
				INSERT INTO MyTable30 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
//			pstmt.setInt(1, 99);
//			pstmt.setString(2, "hello");
			pstmt.setString(1, "888");
			pstmt.setInt(2, 12345);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	@RequestMapping("link3")
	public void method3() throws Exception {
		String sql = """
				INSERT INTO MyTable31 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, "1923-03-01");
			pstmt.setString(2, "1811-11-12 23:50:49");

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	@RequestMapping("link4")
	public void method4() throws Exception {
		String sql = """
				INSERT INTO MyTable31 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
//			pstmt.setString(1, "1923-03-01");
//			pstmt.setString(2, "1811-11-12 23:50:49");
			pstmt.setDate(1, Date.valueOf("2023-03-01"));
			pstmt.setTimestamp(2, Timestamp.valueOf("2000-01-01 22:22:11"));

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	// 경로 : /sub19/link5
	// MyTable32에 새 레코드 추가하는 메소드 완성
	@RequestMapping("link5")
	public void method5() throws Exception {
		String sql = """
				INSERT INTO MyTable32 (Name, Age, Price, Birth, Inserted)
				VALUES (?, ?, ?, ?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
//			pstmt.setString(1, "1923-03-01");
//			pstmt.setString(2, "1811-11-12 23:50:49");
			pstmt.setString(1, "멋진명");
			pstmt.setInt(2, 49);
			pstmt.setDouble(3, 50000000.00);
			pstmt.setDate(4, Date.valueOf("1998-05-14"));
			pstmt.setTimestamp(5, Timestamp.valueOf("1995-04-04 22:21:13"));

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	@RequestMapping("link6")
	public void method6() {
		// forward to form
		// /WEB-INF/views/sub19/link6.jsp
	}

	@RequestMapping("link7")
	public void method7(
			@RequestParam("name") String name,
			@RequestParam("age") String age,
			@RequestParam("price") String price,
			@RequestParam("birth") String birth,
			@RequestParam("inserted") String inserted) throws Exception {

		String sql = """
				INSERT INTO MyTable32 (Name, Age, Price, Birth, Inserted)
				VALUES (?, ?, ?, ?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setString(1, name);
			pstmt.setString(2, age);
			pstmt.setString(3, price);
			pstmt.setString(4, birth);
			pstmt.setString(5, inserted);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}

	}

	@RequestMapping("link8")
	public void method8(
			@RequestParam("name") String name,
			@RequestParam("age") int age,
			@RequestParam("price") Double price,
			@RequestParam("birth") LocalDate birth,
			@RequestParam("inserted") LocalDateTime inserted) throws Exception {

		String sql = """
				INSERT INTO MyTable32 (Name, Age, Price, Birth, Inserted)
				VALUES (?, ?, ?, ?, ?)
				""";

		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, price);
			pstmt.setDate(4, Date.valueOf(birth));
			pstmt.setTimestamp(5, Timestamp.valueOf(inserted));
			pstmt.executeUpdate();
		}

	}

	@RequestMapping("link9")
	public void method9() {
		// forward to form
		// /WEB-INF/views/sub19/link9.jsp
	}

	@RequestMapping("link10")
	public void method10(
			@RequestParam("title") String title,
			@RequestParam("published") LocalDate published,
			@RequestParam("price") int price,
			@RequestParam("updated") LocalDateTime updated,
			@RequestParam("weight") double weight) throws Exception {

		String sql = """
				INSERT INTO MyTable33 (Title, Published, Price, Updated, Weight)
				VALUES (?, ?, ?, ?, ?)
				""";

		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, title);
			pstmt.setDate(2, Date.valueOf(published));
			pstmt.setInt(3, price);
			pstmt.setTimestamp(4, Timestamp.valueOf(updated));
			pstmt.setDouble(5, weight);
			pstmt.executeUpdate();
		}

	}

	@RequestMapping("link11")
	public void method11() throws Exception {
		String sql = """
				SELECT Title, Published, Price, Updated, Weight
				FROM MyTable33
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			if (rs.next()) {
				String title = rs.getString("title");
				String published = rs.getString("published");
				String price = rs.getString("price");
				String updated = rs.getString("updated");
				String weight = rs.getString("weight");

				System.out.println("제목: " + title);
				System.out.println("출판일: " + published);
				System.out.println("가격: " + price);
				System.out.println("업데이트: " + updated);
				System.out.println("무게: " + weight);
			}
		}
	}

	@RequestMapping("link12")
	public void method12() throws Exception {
		String sql = """
				SELECT Title, Published, Price, Updated, Weight
				FROM MyTable33
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			if (rs.next()) {
				String title = rs.getString("title");
				LocalDate published = rs.getDate("published").toLocalDate();
				Integer price = rs.getInt("price");
				LocalDateTime updated = rs.getTimestamp("updated").toLocalDateTime();
				Double weight = rs.getDouble("weight");

				System.out.println("제목: " + title);
				System.out.println("출판일: " + published);
				System.out.println("가격: " + price);
				System.out.println("업데이트: " + updated);
				System.out.println("무게: " + weight);
			}
		}
	}

	// MyTable32의 데이터 조회후 출력하는
	// 13번 메소드 작성
	@RequestMapping("link13")
	public void method13() throws Exception {
		String sql = """
				SELECT Name, Age, Price, Birth, Inserted
				FROM MyTable32
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			if (rs.next()) {
				String name = rs.getString("name");
				Integer age = rs.getInt("age");
				Double price = rs.getDouble("price");
				LocalDate birth = rs.getDate("birth").toLocalDate();
				LocalDateTime inserted = rs.getTimestamp("inserted").toLocalDateTime();

				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
				System.out.println("가격: " + price);
				System.out.println("생일: " + birth);
				System.out.println("입력일시: " + inserted);

			}
		}
	}

	@RequestMapping("link14")
	public void method14(Model model) throws Exception {
		// 1. request param 수집/가공
		// 2. business logic (crud)
		List<Dto05> list = new ArrayList<>();
		String sql = """
				SELECT Name, Age, Price, Birth, Inserted
				FROM MyTable32
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			while (rs.next()) {
				Dto05 o = new Dto05();
				o.setName(rs.getString("name"));
				o.setAge(rs.getInt("age"));
				o.setPrice(rs.getDouble("price"));
				o.setBirth(rs.getDate("birth").toLocalDate());
				o.setInserted(rs.getTimestamp("inserted").toLocalDateTime());

				list.add(o);
			}
		}
		// 3. add attribute
		model.addAttribute("memberList", list);
		// 4. forward/redirect
	}

	// /sub19/link15
	// MyTable33에 있는 데이터들 jsp에서 보여주기
	// 메소드, java beans, jsp
	// 선택) link9에서 데이터 더 넣기
	@RequestMapping("link15")
	public void method15(Model model) throws Exception {
		List<Dto06> list = new ArrayList<>();
		String sql = """
				SELECT Title, Published, Price, Updated, Weight
				FROM MyTable33
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			while (rs.next()) {
				Dto06 o = new Dto06();
				o.setTitle(rs.getString("title"));
				o.setPublished(rs.getDate("published").toLocalDate());
				o.setPrice(rs.getInt("price"));
				o.setUpdated(rs.getTimestamp("updated").toLocalDateTime());
				o.setWeight(rs.getDouble("weight"));

				list.add(o);
			}
		}
		model.addAttribute("memberList", list);
	}
}

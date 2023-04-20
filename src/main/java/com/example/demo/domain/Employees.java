package com.example.demo.domain;

import java.sql.*;

import lombok.*;

@Data
public class Employees {
	private int employeeId;
	private String firstName;
	private String lastName;
	private Date birth;
	private String photo;
	private String notes;
}

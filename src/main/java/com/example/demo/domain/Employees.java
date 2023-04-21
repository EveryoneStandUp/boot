package com.example.demo.domain;

import java.time.*;

import lombok.*;

@Data
public class Employees {
	private int employeeId;
	private String firstName;
	private String lastName;
	private LocalDate birth;
	private String photo;
	private String notes;
}

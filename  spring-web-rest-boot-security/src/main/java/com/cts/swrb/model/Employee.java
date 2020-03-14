package com.cts.swrb.model;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;

	@NotEmpty(message = "firstName should not be empty")
	@NotNull(message = "firstname should not be null")
	private String firstName;

	@NotEmpty(message = "lastName should not be empty")
	@NotNull(message = "lastname should not be null")
	private String lastName;

	@Min(value = 25000, message = "basic cant be less than 25k")
	@Max(value = 4500000, message = "basic cant be less than 4.5lakh")
	private double basic;

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate joinDate;

	@Enumerated(EnumType.STRING)
	private Department dept;

	@Pattern(regexp = "[1-9][0-9]{9}", message = "Mobile number is excepted to be 10 digits")
	@NotNull(message = "mobile no cant be skipped")
	private String mobileNumber;

	@Email(message = "email must be valid")
	@NotNull(message = "email cant be omitted")
	private String email;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

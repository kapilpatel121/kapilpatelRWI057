package com.app.ReadWriteExcelApp;

public class User {
	
	private String Student_Name;
	private Integer year;
	private String Company_Name;
	private String placementStatus;
	private Double GPA;
	
	
	public User() {
		super();
	}


	public User(String student_Name, Integer year, String company_Name, String placementStatus, Double gPA) {
		
		this.Student_Name = student_Name;
		this.year = year;
		this.Company_Name = company_Name;
		this.placementStatus = placementStatus;
		this.GPA = gPA;
	}


	public String getStudent_Name() {
		return Student_Name;
	}


	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public String getCompany_Name() {
		return Company_Name;
	}


	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}


	public String getPlacementStatus() {
		return placementStatus;
	}


	public void setPlacementStatus(String placementStatus) {
		this.placementStatus = placementStatus;
	}


	public Double getGPA() {
		return GPA;
	}


	public void setGPA(Double gPA) {
		GPA = gPA;
	}


	@Override
	public String toString() {
		return "User [Student_Name=" + Student_Name + ", year=" + year + ", Company_Name=" + Company_Name
				+ ", placementStatus=" + placementStatus + ", GPA=" + GPA + "]";
	}


	

	


	
}
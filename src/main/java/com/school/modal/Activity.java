package com.school.modal;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "activites")
public class Activity extends PersistableElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String type;

	private String day;
	
	private String date;
	
	private String startDate;
	
	private String endDate;

	@JsonBackReference(value = "school")
	@ManyToOne
	private School school;

	public Activity() {
		super();
	}

	public Activity(String type, String day, String date, School school) {
		super();
		this.type = type;
		this.day = day;
		this.date = date;
		this.school = school;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDay() {
		return day;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}

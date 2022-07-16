package com.gl.lab6.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="student")
public class Student {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="student_id")
		private int Id;
		@Column(name="first_name")
		private String fname;
		@Column(name="last_name")
		private String lname;
		@Column(name="course")
		private String course;
		@Column(name="country")
		private String country;
		
		public Student() {
			super();
		}

		public Student(String fname, String lname, String course, String country) {
			super();
			this.fname = fname;
			this.lname = lname;
			this.course = course;
			this.country = country;
		}

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "Student [Id=" + Id + ", fname=" + fname + ", lname=" + lname + ", course=" + course + ", country="
					+ country + "]";
		}
		
		
		
	}


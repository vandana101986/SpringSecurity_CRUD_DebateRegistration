package com.gl.lab6.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_login")
public class User {

		@Id
		@GeneratedValue (strategy=GenerationType.IDENTITY)
		@Column(name="user_id")
		private int id;
		@Column(name="user_name")
		private String username;
		@Column(name="pass_word")
		private String password;
		
		@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		@JoinTable(
				name="user_roles",
				joinColumns = @JoinColumn(name = "user_id"),
				inverseJoinColumns=@JoinColumn(name="role_id")
				
				)
		
		private List<Role> role=new ArrayList<>();
		
		public User() {
			super();
		}

		public User(String username, String password, List<Role> roles) {
			super();
			this.username = username;
			this.password = password;
			this.role = roles;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		public List<Role> getRole() {
			return role;
		}
		public void setRole(List<Role> roles) {
			this.role = roles;
		}
		
	}


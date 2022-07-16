package com.gl.lab6.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@Column(name="role_id")
		private int id;
		@Column(name="role_name")
		private String name;
		
		
		public Role() {
			super();
		}

		public Role(String name) {
			super();
			this.name = name;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}


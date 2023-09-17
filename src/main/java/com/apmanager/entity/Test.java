/**
 * 
 */
package com.apmanager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Clase que representa entidades de TESTS.
 */

@Entity
@Table(name="tests")
public class Test {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id_test;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;

	public Long getId_test() {
		return id_test;
	}

	public void setId_test(Long id_test) {
		this.id_test = id_test;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Test(Long id_test, String name, String description) {
		super();
		this.id_test = id_test;
		this.name = name;
		this.description = description;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}

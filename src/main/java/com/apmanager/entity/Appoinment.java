/**
 * 
 */
package com.apmanager.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Clase que representa entidades de APPOINMENTS.
 */
@Entity
@Table(name="appoinments")
public class Appoinment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id_appoinment;
	
	@Column(name="date")
	private LocalDate date;
	
	@Column(name="hour")
	private LocalTime hour;	

	@ManyToOne
	@JoinColumn(name="id_test")
	private Test id_test;
	
    @ManyToOne
	@JoinColumn(name="id_affiliate")
	private Affiliate affiliateId;

	public Long getId_appoinment() {
		return id_appoinment;
	}

	public void setId_appoinment(Long id_appoinment) {
		this.id_appoinment = id_appoinment;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getHour() {
		return hour;
	}

	public void setHour(LocalTime hour) {
		this.hour = hour;
	}

	public Test getId_test() {
		return id_test;
	}

	public void setId_test(Test id_test) {
		this.id_test = id_test;
	}

	public Affiliate getAffiliateId() {
		return affiliateId;
	}

	public void setAffiliateId(Affiliate affiliateId) {
		this.affiliateId = affiliateId;
	}

	public Appoinment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appoinment(Long id_appoinment, LocalDate date, LocalTime hour, Test id_test, Affiliate affiliateId) {
		super();
		this.id_appoinment = id_appoinment;
		this.date = date;
		this.hour = hour;
		this.id_test = id_test;
		this.affiliateId = affiliateId;
	}

	
}

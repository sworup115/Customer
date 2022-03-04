package com.te.springrest1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coustomer {
	@Id
	@Column(name="c_id",nullable =false,length = 12 )
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="c_fname")
	private String firstname;
	private String middlename;
	private String lastname;
	private String mail;
	private double phoneno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public double getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(double phoneno) {
		this.phoneno = phoneno;
	}

}

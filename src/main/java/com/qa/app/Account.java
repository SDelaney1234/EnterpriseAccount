package com.qa.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Account {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="account_number")
	private String accountnumber;
	
	public Account() { };
	
	public Account(String firstname, String surname, String accountnumber) {
		this.firstname= firstname;
		this.surname= surname;
		this.accountnumber= accountnumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", firstname=" + firstname + ", surname=" + surname + ", accountnumber="
				+ accountnumber + "]";
	}
	
	
}

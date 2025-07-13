package com.practise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicleuserdetails")
public class OwnerDetails {

	@Id
	private int id;
	private String name;

	
	private String flatno;
	private String gender;

	private String tenantOrOwner;
	private String contact;
	

	public String getFlatno() {
		return flatno;
	}

	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTenantOrOwner() {
		return tenantOrOwner;
	}

	public void setTenantOrOwner(String tenantOrOwner) {
		this.tenantOrOwner = tenantOrOwner;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String string) {
		this.contact = string;
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

	@Override
	public String toString() {
		return "OwnerDetails [id=" + id + ", name=" + name + ", flatno=" + flatno + ", gender=" + gender
				+ ", tenantOrOwner=" + tenantOrOwner + ", contact=" + contact + "]";
	}

}

package com.explore.spring.data.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Model {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false,unique=true)
	private String name;
	@Column(nullable=false)
	private double price;
	@Column(nullable=false)
	private String woodtype;
	@Column(nullable=false)
	private Date inventoryDate;
	@Column(nullable=false)
	private String description;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getWoodtype() {
		return woodtype;
	}
	public void setWoodtype(String woodtype) {
		this.woodtype = woodtype;
	}
	public Date getInventoryDate() {
		return inventoryDate;
	}
	public void setInventoryDate(Date inventoryDate) {
		this.inventoryDate = inventoryDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

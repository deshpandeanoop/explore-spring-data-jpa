package com.explore.spring.data.jpa.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Manufacturer {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private Date foundedDate;
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="manufacturer__location",
	joinColumns = @JoinColumn(name="manufacturer_id"),inverseJoinColumns=@JoinColumn(name="location_id"))
	private List<Location> locations;
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="manufacturer_id")
	private List<Model> models;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getFoundedDate() {
		return foundedDate;
	}
	public void setFoundedDate(Date foundedDate) {
		this.foundedDate = foundedDate;
	}
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	
}

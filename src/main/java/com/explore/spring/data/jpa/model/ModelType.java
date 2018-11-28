package com.explore.spring.data.jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class ModelType {
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false)
	private String name;
	@OneToMany
	@JoinColumn(name="modeltype_id")
	private List<Model> models;
}

package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "software_table")
@DynamicUpdate
public class Software {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "version")
	private String version;
	
	@Column(name = "release_date")
	private String releaseDate;
	
	@Column(name = "price")
	private String price;
	
	@Column(name ="operating_systems")
	private String operatingSystems;
	
	@Column(name = "installer_size")
	private String installerSize;
	
	@Column(name = "ratings")
	private String ratings;
	
	@Column(name = "description")
	private String description;
	
	public Software() {
		
	}

	public Software(Integer id, String name, String version, String releaseDate, String price, String operatingSystems,
			String installerSize, String ratings, String description) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.releaseDate = releaseDate;
		this.price = price;
		this.operatingSystems = operatingSystems;
		this.installerSize = installerSize;
		this.ratings = ratings;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getInstallerSize() {
		return installerSize;
	}

	public void setInstallerSize(String installerSize) {
		this.installerSize = installerSize;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
	
	
	
	
	
	








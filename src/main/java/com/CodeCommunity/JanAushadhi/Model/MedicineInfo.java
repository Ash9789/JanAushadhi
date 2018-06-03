package com.CodeCommunity.JanAushadhi.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="medicine_info")
@EntityListeners(AuditingEntityListener.class)
public class MedicineInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="medicine_name" , nullable = false)
	private String medicineName;
	
	@Column(name="generic_name")
	private String genericName;
	
	@Column(name="indications")
	private String indications;
	
	@Column(name="dosage")
	private String dosage;
	
	@Column(name="drugForm")
	private String drugForm;
	
	@Column(name="side_effects")
	private String sideEffects;
	
	@Column(name="price")
	private int price;
	
	@Column(name="manufacture_name")
	private String manufactureName;
	
	@Column(nullable =false, updatable= false)
	@Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	private Date createdAt;
	
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getGenericName() {
		return genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
	public String getIndications() {
		return indications;
	}
	public void setIndications(String indications) {
		this.indications = indications;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getDrugForm() {
		return drugForm;
	}
	public void setDrugForm(String drugForm) {
		this.drugForm = drugForm;
	}
	public String getSideEffects() {
		return sideEffects;
	}
	public void setSideEffects(String sideEffects) {
		this.sideEffects = sideEffects;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getManufactureName() {
		return manufactureName;
	}
	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}

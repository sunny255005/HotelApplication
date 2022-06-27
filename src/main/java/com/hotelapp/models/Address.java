package com.hotelapp.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
	@Id
	@GeneratedValue(generator="address_id",strategy=GenerationType.IDENTITY)
	@SequenceGenerator(name="address_id",sequenceName="address_id")
	private Integer addressId;
	private String city;
	private String postalCode;
	private String postOffice;
	private String district;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", postalCode=" + postalCode + ", postOffice=" + postOffice + ", district="
				+ district + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPostOffice() {
		return postOffice;
	}
	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Address(String city, String postalCode, String postOffice, String district) {
		super();
		this.city = city;
		this.postalCode = postalCode;
		this.postOffice = postOffice;
		this.district = district;
	}
	
	
}

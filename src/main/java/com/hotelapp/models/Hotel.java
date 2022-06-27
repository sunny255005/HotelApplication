package com.hotelapp.models;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hotel {
public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public Address getHotelAddess() {
		return hotelAddess;
	}
	public void setHotelAddess(Address hotelAddess) {
		this.hotelAddess = hotelAddess;
	}
	public Set<Menu> getMenuList() {
		return menuList;
	}
	public void setMenuList(Set<Menu> menuList) {
		this.menuList = menuList;
	}
	public Set<Delivery> getDeliveryList() {
		return deliveryList;
	}
	public void setDeliveryList(Set<Delivery> deliveryList) {
		this.deliveryList = deliveryList;
	}
@Id
@GeneratedValue(generator="hotel_id",strategy=GenerationType.AUTO)
@SequenceGenerator(name="hotel_id",sequenceName="hotel_id")
private Integer hotelId;
private String hotelName;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="address_id")
private Address hotelAddess;

@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@JoinColumn(name="hotel_id")
private Set<Menu> menuList;

@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@JoinTable(name="Hotel_Delivery",
joinColumns=@JoinColumn(name="hotel_id"),
inverseJoinColumns=@JoinColumn(name="delivery_id"))
private Set<Delivery>deliveryList;

@Override
public String toString() {
	return "Hotel [hotelName=" + hotelName + ", hotelAddess=" + hotelAddess + ", menuList=" + menuList
			+ ", deliveryList=" + deliveryList + "]";
}
public Hotel(String hotelName, Address hotelAddess, Set<Menu> menuList, Set<Delivery> deliveryList) {
	super();
	this.hotelName = hotelName;
	this.hotelAddess = hotelAddess;
	this.menuList = menuList;
	this.deliveryList = deliveryList;
}
public Hotel() {
	super();
	// TODO Auto-generated constructor stub
}

}

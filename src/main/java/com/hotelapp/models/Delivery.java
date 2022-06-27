package com.hotelapp.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Delivery {
	@Id
	@GeneratedValue(generator="delivery_id",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="delivery_id",sequenceName="delivery_id")
	private Integer deliveryId;
	private String deliveryName;
	private Integer deliveryCharge;
	@ManyToMany(mappedBy="deliveryList")
	private Set<Hotel>hotelList=new HashSet<>();
	
	
	@Override
	public String toString() {
		return "Delivery [deliveryName=" + deliveryName + ", deliveryCharge=" + deliveryCharge + "]";
	}
	public String getDeliveryName() {
		return deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	public Integer getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(Integer deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	public Delivery(String deliveryName, Integer deliveryCharge) {
		super();
		this.deliveryName = deliveryName;
		this.deliveryCharge = deliveryCharge;
	}
	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}
}

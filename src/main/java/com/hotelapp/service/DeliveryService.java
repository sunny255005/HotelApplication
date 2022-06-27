package com.hotelapp.service;

import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;

public interface DeliveryService {

	void addDelivery(Delivery delivery);
	
	void updateDelivery(Delivery delivery);
	
	void deleteDelivery(int deliveryId);
	
	
	//get deliveries by delivery id
	
	Delivery getDeliveryById(int deliveryId);
	
	
	//get deliveries by delivery partner name
	

	Delivery getDeliveryByPartner(String deliveryName);

	
}

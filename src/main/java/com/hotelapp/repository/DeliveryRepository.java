package com.hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hotelapp.models.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery,Integer>{

	//Derived Queries --@Query
	//findBy(propperty name)
	//getBy(property name)
	//readBy(property name)
	
	
	//we want to get our delivery details based on our delivery partner name
	//(like swiggy,zomato)
	
	
	
	Delivery readByDeliveryName(String deliveryName);
	
	
	
}

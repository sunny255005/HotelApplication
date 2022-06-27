package com.hotelapp.service;

import java.util.List;



import com.hotelapp.models.Hotel;


public interface HotelService {


	// crud operations on hotels
	
	Hotel addHotel(Hotel hotel);
	
	Hotel updateHotel(Hotel hotel);
	
	void deleteHotel(int hotelId);
	
	
	//get hotels by hotel id
	
	Hotel getHotelById(int hotelId);
	
	
	//get all hotels
	List<Hotel>getAllHotels();
	
	
	
	
	//get list of hotels by sertain criteria like city,menu name,delivery partner name
	
	List <Hotel>getHotelsByCity(String city);
	
	List <Hotel>getHotelsByMenu(String menuName);
	
	List <Hotel>getHotelsByDeliveryPartnerName(String deliveryPartnerName);
	
	
	
	List <Hotel>getHotelsByLocationAndMenu(String city,String menuName);
	
//	List <Hotel>getHotelsByLocationAndDeliveryPartnerName(String city,String menuName,String deliveryPartnerName);
	
	
	
	
}

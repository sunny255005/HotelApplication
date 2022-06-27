package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.models.Hotel;
import com.hotelapp.repository.HotelRepository;


@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		
	return 	hotelRepository.save(hotel);
		
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		
	return 	hotelRepository.save(hotel);

	}

	@Override
	public void deleteHotel(int hotelId) {
		// TODO Auto-generated method stub
	 	hotelRepository.deleteById(hotelId);

	}

	@Override
	public Hotel getHotelById(int hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return  hotelRepository.findAll();
	}

	@Override
	public List<Hotel> getHotelsByCity(String city) {
		

		return hotelRepository.findByHotelAddessCity(city);
	}

	@Override
	public List<Hotel> getHotelsByMenu(String menuName) {
		// TODO Auto-generated method stub
		return hotelRepository.getHotelsByMenu(menuName);
	}

	@Override
	public List<Hotel> getHotelsByDeliveryPartnerName(String deliveryPartnerName) {
		// TODO Auto-generated method stub
		return hotelRepository.getHotelsByDeliveryPartnerName(deliveryPartnerName);
	}



	@Override
	public List<Hotel> getHotelsByLocationAndMenu(String city, String menuName) {
		// TODO Auto-generated method stub
		return hotelRepository.getHotelsByLocationAndMenu(city, menuName);
	}

	// @Override
	// public List<Hotel> getHotelsByLocationAndDeliveryPartnerName(String city, String menuName,
	// 		String deliveryPartnerName) {
	// 	// TODO Auto-generated method stub
	// 	return null;
	// }

}

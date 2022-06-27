package com.hotelapp;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.models.Address;
import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.DeliveryService;
import com.hotelapp.service.HotelService;

@SpringBootApplication
public class SpringHotelappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappApplication.class, args);
	}

	
	@Autowired
	HotelService hotelService;
	
	@Autowired
	DeliveryService deliveryService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		/*
		  Address address=new Address("Contai","721444","ContaiPO","Purba Medinipur");
		  
		  Menu menu3=new Menu("ram","100"); Menu menu4=new Menu("sam","200"); 
		  
		  Set<Menu>menuList=new HashSet<>(Arrays.asList(menu3,menu4)); 
		  
		  Delivery delivery1=new Delivery("Swiggy",20); 
		  Delivery delivery2=new Delivery("Zomato",15); 
		  Delivery delivery3=new Delivery("Zomby",25);
		  
		  // Delivery delivery4=deliveryService.getDeliveryByPartner("Swiggy"); //
		  //System.out.println("delivery is "+delivery4); 
		  
		  Set<Delivery>deliveryList=new HashSet<>(Arrays.asList(delivery1,delivery2,delivery3)); Hotel hotel=new
		  
		  Hotel("HotelSa",address,menuList,deliveryList); System.out.println(hotel);
		  
		  hotelService.addHotel(hotel);
		 */
		
		
		Hotel hotel=hotelService.getHotelById(1);
		System.out.println("My name is "+hotel);
		
		//System.out.println(hotel.getHotelName());
		hotel.getHotelAddess().setCity("CCTV");
		hotelService.updateHotel(hotel);
		System.out.println(hotel);

		//Hotel hotel2=hotelService.getHotelById(2);
		//hotelService.deleteHotel(2);


		System.out.println("**************************");
		hotelService.getHotelsByCity("CCTV")
		.stream()
		.forEach(System.out::println);


		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		hotelService.getHotelsByMenu("ram")
		.stream()
		.forEach(System.out::println);
		
	

		System.out.println("iloveyou((((((((((((((((((((((((((");
		hotelService.getHotelsByDeliveryPartnerName("Swiggy")
		.stream()
		.forEach(System.out::println);


		System.out.println("0000000000000000000000");
		hotelService.getHotelsByLocationAndMenu("CCTV","ram")
		.stream()
		.forEach(System.out::println);
		



	}

}

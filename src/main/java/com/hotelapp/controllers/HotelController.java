package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.models.Hotel;
import com.hotelapp.service.HotelService;

@RequestMapping("/hotels-rest-api")
@RestController
public class HotelController {

    @Autowired
    HotelService hotelService;
	
    
	// crud operations on hotels

    @PostMapping("/add-hotels")
 public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
        Hotel newHotel=hotelService.addHotel(hotel);
        HttpHeaders header=new HttpHeaders();
        header.add("description","added a new hotel");
        return ResponseEntity.ok().headers(header).body(newHotel);


 }
	

    @PutMapping("/update-hotels")
	public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel){
        Hotel updatedHotel=hotelService.updateHotel(hotel);
        HttpHeaders header=new HttpHeaders();
        header.add("description","updated the  hotel");
        return ResponseEntity.ok().headers(header).body(updatedHotel);


    }
	
    @DeleteMapping("/delete-hotel/{hotelId}")
	public ResponseEntity <Void> deleteHotel(@PathVariable int hotelId){
        hotelService.deleteHotel(hotelId);
        return ResponseEntity.ok().build();
    }
	
	
	//get hotels by hotel id
	
    @GetMapping("/get-hotel/{hotelId}")
 public ResponseEntity <Hotel> getHotelById(@PathVariable int hotelId){
    Hotel hotel=hotelService.getHotelById(hotelId);
    HttpHeaders header=new HttpHeaders();
    header.add("description","getting  a  hotel");
    return ResponseEntity.ok().headers(header).body(hotel);


 }


 @GetMapping("/get-all-hotels")
 public ResponseEntity <List<Hotel>> getAllHotels(){
    List<Hotel> hotelList=hotelService.getAllHotels();
    HttpHeaders header=new HttpHeaders();
    header.add("description","getting  all  hotels");
    return ResponseEntity.ok().headers(header).body(hotelList);


 }



	


	
	//get all hotels
	List<Hotel>getAllHotels();
	
	
	
	
	//get list of hotels by sertain criteria like city,menu name,delivery partner name
	
    @GetMapping("/hotels/hotels-by-city/{cityName}")
	public ResponseEntity< List <Hotel> >getHotelsByCity(@PathVariable("cityName") String city){
            List<Hotel>hotelList=hotelService.getHotelsByCity(city);
            return ResponseEntity.ok().body(hotelList);
    }
	
    @GetMapping("/hotels/hotels-by-menu/{menuName}")
	public ResponseEntity <List <Hotel>>getHotelsByMenu(@PathVariable String menuName){
        List<Hotel>hotelList=hotelService.getHotelsByMenu(menuName);
        return ResponseEntity.ok().body(hotelList);
    }

	
    @GetMapping("/hotels/hotels-by-delivery-partner/{deliveryPartnerName}")
    public ResponseEntity<	List <Hotel> >getHotelsByDeliveryPartnerName(@PathVariable String deliveryPartnerName)
	{
        List<Hotel>hotelList=hotelService.getHotelsByDeliveryPartnerName(deliveryPartnerName);
        return ResponseEntity.ok().body(hotelList);
    }


	
	@GetMapping("/hotels/hotels-by-city/{city}/menuName/{menuName}")
    public ResponseEntity<	List <Hotel> >getHotelsByLocationAndMenu(@PathVariable String city,@PathVariable String menuName)
	{
        List<Hotel>hotelList=hotelService.getHotelsByLocationAndMenu(city, menuName);
        return ResponseEntity.ok().body(hotelList);
    }

	//List <Hotel>getHotelsByLocationAndDeliveryPartnerName(String city,String menuName,String deliveryPartnerName);
	
	
	
}

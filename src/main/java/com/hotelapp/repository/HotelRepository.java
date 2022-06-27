package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelapp.models.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {
	


    //derived query
    //city is not property of hotel but address is property of hotel and city is part 
    //of address

    List<Hotel> findByHotelAddessCity(String city);

    @Query("FROM Hotel h inner join h.menuList mn WHERE mn.menuName =?1")
    List<Hotel>getHotelsByMenu(String menuName);

    @Query("From Hotel h inner join h.deliveryList d where d.deliveryName=?1")
    List<Hotel>getHotelsByDeliveryPartnerName(String deliveryName);

    @Query("From Hotel h inner join h.hotelAddess a inner join h.menuList mn where a.city=?1 AND mn.menuName=?2")
    List<Hotel>getHotelsByLocationAndMenu(String city,String menuName);

}

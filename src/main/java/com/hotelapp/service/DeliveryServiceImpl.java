package com.hotelapp.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.models.Delivery;
import com.hotelapp.repository.DeliveryRepository;

@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService {

	
	@Autowired
	DeliveryRepository deliveryRepository;
	
	@Override
	public void addDelivery(Delivery delivery) {
		// TODO Auto-generated method stub
		deliveryRepository.save(delivery);
		
	}

	@Override
	public void updateDelivery(Delivery delivery) {
		// TODO Auto-generated method stub
		deliveryRepository.save(delivery);

	}

	@Override
	public void deleteDelivery(int deliveryId) {
		// TODO Auto-generated method stub
		deliveryRepository.deleteById(deliveryId);

	}

	@Override
	@Transactional
	public Delivery getDeliveryById(int deliveryId) {
		// TODO Auto-generated method stub
		return deliveryRepository.findById(deliveryId).get();
	}

	@Override
	@Transactional
	public Delivery getDeliveryByPartner(String deliveryName) {
		// TODO Auto-generated method stub 
		return deliveryRepository.readByDeliveryName(deliveryName);
	}

}

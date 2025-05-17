package com.deliveryboy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.config.AppContant;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public boolean updateLocation(String loation) {
		
		this.kafkaTemplate.send(AppContant.LOCATION_UPDATE_TPOIC_STRING, loation);
		return true;
	}
}

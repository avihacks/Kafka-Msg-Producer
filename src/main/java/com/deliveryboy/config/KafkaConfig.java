package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

	
	@Bean
	public NewTopic topic() {
		
		return TopicBuilder
				.name(AppContant.LOCATION_UPDATE_TPOIC_STRING)
				//.partitions(1)
				//.replicas(1)
				.build();
				
	}
}

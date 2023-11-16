package com.kafka.demo.provider.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	
	@Bean
	public NewTopic generateTopic() {
		Map<String, String> configurations = new HashMap<>();
		// Borra el mensaje
		configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
		// Tiempo que duran los mensajes en el topic (ms) por defecto viene en -1 que significa que nunca se borran
		configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");
		// Tamaño máximo de los segmentos dentro de topic
		configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824");
		// Tamaño máximo de cada mensaje (por defecto 1MB)
		configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012");
		
		return TopicBuilder.name("bitacora-dev").partitions(2).replicas(1).configs(configurations).build();
	}
}

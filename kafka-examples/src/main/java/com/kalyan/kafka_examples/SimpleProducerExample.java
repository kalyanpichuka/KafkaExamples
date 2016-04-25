package com.kalyan.kafka_examples;

import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.kafka.clients.producer.*;

public class SimpleProducerExample {

	public static void main(String[] args) {

		long events = Long.parseLong(args[0]);
		String topic = args[1];
		String brokers = args[2];

		Properties kprops = new Properties();
		kprops.put("bootstrap.servers", brokers);
		kprops.put("acks", "1");
		kprops.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		kprops.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		Producer<String, String> producer = new KafkaProducer<>(kprops);

		for (int numEvents = 0; numEvents < events; numEvents++) {
			long runtime = new Date().getTime();
			String ipad = "192.168.56." + new Random().nextInt(255);
			String msg = runtime + "|" + numEvents + "|" + "kalyan.com/index.html" + "|" + ipad;
			ProducerRecord<String, String> prodrec = new ProducerRecord<String, String>(topic, ipad, msg);
			producer.send(prodrec);
		}

		producer.close();
	}

}

package com.linstid.energydashws.config;

import java.util.Arrays;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.linstid.energydashws.entities.HoursEntity;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;

public class MongoDB {
	private static final MongoDB INSTANCE = new MongoDB();
	private final Datastore datastore;
	public static final String DB_NAME = "energydash";

	private MongoDB() {
		try {
			MongoClient mongoClient = new MongoClient(Arrays.asList(
					new ServerAddress("127.0.0.1", 27017), 
					new ServerAddress("127.0.0.1", 27018), 
					new ServerAddress("127.0.0.1", 27019)));
			mongoClient.setWriteConcern(WriteConcern.SAFE);
			datastore = new Morphia().mapPackage(
					HoursEntity.class.getPackage().getName()).createDatastore(
					mongoClient, DB_NAME);
			datastore.ensureIndexes();
		} catch (Exception e) {
			throw new RuntimeException("Error initializing mongodb", e);
		}
	}

	public static MongoDB getInstance() {
		return INSTANCE;
	}

	public Datastore getDatastore() {
		return datastore;
	}

}

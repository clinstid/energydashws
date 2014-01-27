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

	private MongoDB() {
		String host = System.getProperty("MONGO_HOST", "localhost");
		String database = System.getProperty("MONGO_DATABASE", "energydash");
		int port = Integer.parseInt(System.getProperty("MONGO_PORT", "27018"));

		MongoClient mongoClient = null;
		try {
			mongoClient = new MongoClient(Arrays.asList(new ServerAddress(host,
					port)));
		} catch (Exception e) {
			throw new RuntimeException("Error initializing mongodb", e);
		}

		mongoClient.setWriteConcern(WriteConcern.SAFE);
		datastore = new Morphia().mapPackage(
				HoursEntity.class.getPackage().getName()).createDatastore(
				mongoClient, database);
		datastore.ensureIndexes();
	}

	public static MongoDB getInstance() {
		return INSTANCE;
	}

	public Datastore getDatastore() {
		return datastore;
	}

}

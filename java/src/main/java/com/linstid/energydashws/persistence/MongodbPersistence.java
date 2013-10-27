package com.linstid.energydashws.persistence;

import java.util.Date;
import java.util.List;

import com.google.code.morphia.Datastore;
import com.linstid.energydashws.config.MongoDB;
import com.linstid.energydashws.entities.HoursEntity;
import com.linstid.energydashws.entities.ReadingEntity;
import com.mongodb.MongoException;

public class MongodbPersistence implements Persistence {

	private Datastore mongoDatastore;

	public MongodbPersistence() {
		setMongoDatastore(MongoDB.getInstance().getDatastore());
	}

	@Override
	public List<HoursEntity> getRangeOfHours(Date start, Date end) {
		List<HoursEntity> response = null;
		try {
			response = mongoDatastore.createQuery(HoursEntity.class)
					.filter("_id >=", start).filter("_id <=", end).order("_id")
					.asList();
		} catch (MongoException e) {
			System.out.println("Query failed: " + e);
		}
		return response;
	}

	public Datastore getMongoDatastore() {
		return mongoDatastore;
	}

	public void setMongoDatastore(Datastore mongoDatastore) {
		this.mongoDatastore = mongoDatastore;
	}

	@Override
	public ReadingEntity getLastReading() {
		ReadingEntity response = null;
		try {
			response = mongoDatastore.find(ReadingEntity.class).order("-_id").limit(1).get();
		} catch (MongoException e) {
			System.out.println("Query failed: " + e);
		}
		return response;
	}

	@Override
	public List<ReadingEntity> getRangeofReadings(Date start, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

}
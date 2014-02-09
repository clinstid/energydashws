package com.linstid.energydashws.persistence;

import java.util.Date;
import java.util.List;

import com.google.code.morphia.Datastore;
import com.linstid.energydashws.config.MongoDB;
import com.linstid.energydashws.entities.HoursEntity;
import com.linstid.energydashws.entities.HoursInDayEntity;
import com.linstid.energydashws.entities.HoursPerDayOfWeekEntity;
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
			// TODO: Logging
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
			response = mongoDatastore.find(ReadingEntity.class).order("-_id")
					.limit(1).get();
		} catch (MongoException e) {
			// TODO: Logging
			System.out.println("Query failed: " + e);
		}
		return response;
	}

	@Override
	public List<ReadingEntity> getRangeOfReadings(Date start, Date end) {
		List<ReadingEntity> response = null;
		try {
			response = mongoDatastore.createQuery(ReadingEntity.class)
					.filter("reading_timestamp >=", start)
					.filter("reading_timestamp <=", end)
					.order("-reading_timestamp").asList();
		} catch (MongoException e) {
			// TODO: Logging
			System.out.println("Query failed: " + e);
		}
		return response;
	}

	@Override
	public HoursEntity getLastHour() {
		HoursEntity response = null;
		try {
			response = mongoDatastore.find(HoursEntity.class).order("-_id")
					.limit(1).get();
		} catch (MongoException e) {
			// TODO: Logging
			System.out.println("Query failed: " + e);
		}
		return response;
	}

	@Override
	public List<HoursPerDayOfWeekEntity> getHoursPerDayOfWeek() {
		List<HoursPerDayOfWeekEntity> response = null;
		try {
			response = mongoDatastore.createQuery(HoursPerDayOfWeekEntity.class).asList();
		} catch (MongoException e) {
			// TODO: Logging
			System.out.println("Query failed: " + e);
		}
		return response;
	}

	@Override
	public HoursPerDayOfWeekEntity getHoursForSpecificDayOfWeek(String dayName) {
		HoursPerDayOfWeekEntity response = null;
		try {
			response = mongoDatastore.createQuery(HoursPerDayOfWeekEntity.class)
					.filter("_id =", dayName).get();
		} catch (MongoException e) {
			// TODO: Logging
			System.out.println("Query failed: " + e);
		}
		return response;
	}

	@Override
	public List<HoursInDayEntity> getHoursInDay() {
		List<HoursInDayEntity> response = null;
		try {
			response = mongoDatastore.createQuery(HoursInDayEntity.class).asList();
		} catch (MongoException e) {
			// TODO: Logging
			System.out.println("Query failed: " + e);
		}
		return response;
	}

}

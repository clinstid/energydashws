package com.linstid.energydashws.persistence;

import java.util.Date;
import java.util.List;

import com.google.code.morphia.Datastore;
import com.linstid.energydashws.config.MongoDB;
import com.linstid.energydashws.entities.HoursEntity;

public class MongodbPersistence implements Persistence {

	private Datastore mongoDatastore;

	public MongodbPersistence() {
		setMongoDatastore(MongoDB.getInstance().getDatastore());
	}

	@Override
	public List<HoursEntity> getRangeOfHours(Date start, Date end) {
		return mongoDatastore.createQuery(HoursEntity.class)
				.filter("_id >=", start).filter("_id <=", end).order("_id").asList();
	}

	public Datastore getMongoDatastore() {
		return mongoDatastore;
	}

	public void setMongoDatastore(Datastore mongoDatastore) {
		this.mongoDatastore = mongoDatastore;
	}

}

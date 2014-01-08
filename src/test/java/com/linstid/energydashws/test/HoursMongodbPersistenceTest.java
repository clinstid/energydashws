package com.linstid.energydashws.test;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.linstid.energydashws.entities.HoursEntity;
import com.linstid.energydashws.persistence.MongodbPersistence;
import com.linstid.energydashws.persistence.Persistence;

// These tests are for the MongodbPersistence layer.
public class HoursMongodbPersistenceTest {

	private Persistence persistence;

	@Before
	public void setUp() throws Exception {
		persistence = new MongodbPersistence();
		assertNotNull(persistence);
	}

	@After
	public void tearDown() throws Exception {
		// persistence.clearData();

	}

	@Test
	public void test() {
		Calendar cal = Calendar.getInstance();
		Date end = cal.getTime();
		cal.add(Calendar.HOUR, -24);
		Date start = cal.getTime();
		List<HoursEntity> hours = persistence.getRangeOfHours(start, end);
		System.out.println(start.toString() + " --> " + end.toString());
		for (HoursEntity hour : hours) {
			System.out.println(hour.getId().toString() + ": usage("
					+ hour.getAverageUsage() + ") temp("
					+ hour.getAverageTempF() + "F)");
		}
	}

}

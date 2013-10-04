package com.linstid.energydashws.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Calendar;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.code.morphia.Datastore;
import com.linstid.energydashws.persistence.MongodbPersistence;
import com.linstid.energydashws.persistence.Persistence;
import com.linstid.energydashws.entities.HoursEntity;

public class HoursTest {

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

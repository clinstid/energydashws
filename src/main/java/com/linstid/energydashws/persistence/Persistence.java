package com.linstid.energydashws.persistence;

import java.util.Date;
import java.util.List;

import com.linstid.energydashws.entities.HoursEntity;
import com.linstid.energydashws.entities.ReadingEntity;

public interface Persistence {
	List<HoursEntity> getRangeOfHours(Date start, Date end);
	ReadingEntity getLastReading();
	HoursEntity getLastHour();
	List<ReadingEntity> getRangeOfReadings(Date start, Date end);
}

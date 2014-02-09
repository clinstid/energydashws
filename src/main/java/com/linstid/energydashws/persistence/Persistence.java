package com.linstid.energydashws.persistence;

import java.util.Date;
import java.util.List;

import com.linstid.energydashws.entities.HoursEntity;
import com.linstid.energydashws.entities.HoursInDayEntity;
import com.linstid.energydashws.entities.HoursPerDayOfWeekEntity;
import com.linstid.energydashws.entities.ReadingEntity;

public interface Persistence {
	List<HoursEntity> getRangeOfHours(Date start, Date end);
	ReadingEntity getLastReading();
	HoursEntity getLastHour();
	List<ReadingEntity> getRangeOfReadings(Date start, Date end);
	List<HoursPerDayOfWeekEntity> getHoursPerDayOfWeek();
	HoursPerDayOfWeekEntity getHoursForSpecificDayOfWeek(String dayName);
	List<HoursInDayEntity> getHoursInDay();
}

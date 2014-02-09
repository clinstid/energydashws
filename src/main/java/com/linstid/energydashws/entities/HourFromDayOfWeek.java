package com.linstid.energydashws.entities;

import java.util.Date;
import java.util.List;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Property;

@Embedded
public class HourFromDayOfWeek {
	@Property("average_usage")
	private float averageUsage;
	
	@Property("count")
	private int count;
	
	@Property("average_tempf")
	private float averageTempF;
	
	@Property("timestamps")
	private List<Date> timeStamps;

	public float getAverageUsage() {
		return averageUsage;
	}

	public void setAverageUsage(float averageUsage) {
		this.averageUsage = averageUsage;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public float getAverageTempF() {
		return averageTempF;
	}

	public void setAverageTempF(float averageTempF) {
		this.averageTempF = averageTempF;
	}

	public List<Date> getTimeStamps() {
		return timeStamps;
	}

	public void setTimeStamps(List<Date> timeStamps) {
		this.timeStamps = timeStamps;
	}

}

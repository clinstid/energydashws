package com.linstid.energydashws.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Property;

@Entity(value = "hours_in_day", noClassnameStored = true)
public class HoursInDayEntity implements Serializable {
	
	@Id
	private int id;
	
	@Property("count")
	private int count;
	
	@Property("average_usage")
	private float averageUsage;
	
	@Property("average_tempf")
	private float averageTempF;
	
	@Property("timestamps")
	private List<Date> timestamps;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public float getAverageUsage() {
		return averageUsage;
	}

	public void setAverageUsage(float averageUsage) {
		this.averageUsage = averageUsage;
	}

	public float getAverageTempF() {
		return averageTempF;
	}

	public void setAverageTempF(float averageTempF) {
		this.averageTempF = averageTempF;
	}

	public List<Date> getTimestamps() {
		return timestamps;
	}

	public void setTimestamps(List<Date> timestamps) {
		this.timestamps = timestamps;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

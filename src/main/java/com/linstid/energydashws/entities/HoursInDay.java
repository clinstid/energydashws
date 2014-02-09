package com.linstid.energydashws.entities;

import java.io.Serializable;
import java.util.Date;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Property;

@Entity(value = "hours_in_day", noClassnameStored = true)
public class HoursInDay implements Serializable {

	private static final long serialVersionUID = -6694080643228739813L;
	
	@Id
	private Date id;
	
	@Property("count")
	private int count;
	
	@Property("average_usage")
	private float averageUsage;
	
	@Property("average_tempf")
	private float averageTempF;

	public Date getId() {
		return id;
	}

	public void setId(Date id) {
		this.id = id;
	}

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
}

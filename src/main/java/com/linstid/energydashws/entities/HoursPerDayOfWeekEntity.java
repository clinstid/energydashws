package com.linstid.energydashws.entities;

import java.io.Serializable;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Property;

@Entity(value = "hours_per_dow", noClassnameStored = true)
public class HoursPerDayOfWeekEntity implements Serializable {

	private static final long serialVersionUID = -6694080643228739813L;

	// The id is the day of the week abbreviation as a String like, "Sun" for
	// Sunday.
	@Id
	private String id;

	@Property("timezone")
	private String timeZone;

	@Embedded("hours")
	private HoursFromDayOfWeekEntity hours;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public HoursFromDayOfWeekEntity getHours() {
		return hours;
	}

	public void setHours(HoursFromDayOfWeekEntity hours) {
		this.hours = hours;
	}
}

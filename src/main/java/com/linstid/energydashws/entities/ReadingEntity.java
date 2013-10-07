package com.linstid.energydashws.entities;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Property;

@Entity(value = "envir_reading", noClassnameStored = true)
public class ReadingEntity implements Serializable {

	private static final long serialVersionUID = -6804237190960512885L;
	
	@Id
	private ObjectId id;

	@Property("reading_timestamp")
	private Date readingTimestamp;
	
	@Property("receiver_days_since_birth")
	private Integer receiverDaysSinceBirth;
	
	@Property("receiver_time")
	private String receiverTime;
	
	@Property("ch1_watts")
	private Integer ch1Watts;
	
	@Property("ch2_watts")
	private Integer ch2Watts;
	
	@Property("ch3_watts")
	private Integer ch3Watts;
	
	@Property("total_watts")
	private Integer totalWatts;
	
	@Property("temp_f")
	private Float tempF;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Date getReadingTimestamp() {
		return readingTimestamp;
	}

	public void setReadingTimestamp(Date readingTimestamp) {
		this.readingTimestamp = readingTimestamp;
	}

	public Integer getCh1Watts() {
		return ch1Watts;
	}

	public void setCh1Watts(Integer ch1Watts) {
		this.ch1Watts = ch1Watts;
	}

	public Integer getCh2Watts() {
		return ch2Watts;
	}

	public void setCh2Watts(Integer ch2Watts) {
		this.ch2Watts = ch2Watts;
	}

	public Integer getCh3Watts() {
		return ch3Watts;
	}

	public void setCh3Watts(Integer ch3Watts) {
		this.ch3Watts = ch3Watts;
	}

	public Integer getTotalWatts() {
		return totalWatts;
	}

	public void setTotalWatts(Integer totalWatts) {
		this.totalWatts = totalWatts;
	}

	public Float getTempF() {
		return tempF;
	}

	public void setTempF(Float tempF) {
		this.tempF = tempF;
	}
	
	

}

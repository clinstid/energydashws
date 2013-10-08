package com.linstid.energydashws.persistence;

import java.util.Date;
import java.util.List;

import com.linstid.energydashws.entities.HoursEntity;

public interface Persistence {
	List<HoursEntity> getRangeOfHours(Date start, Date end);
}

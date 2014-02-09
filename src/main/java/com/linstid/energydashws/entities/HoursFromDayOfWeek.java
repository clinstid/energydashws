package com.linstid.energydashws.entities;

import java.util.Date;

import com.google.code.morphia.annotations.Embedded;

@Embedded
public class HoursFromDayOfWeek {
	// The original implementation of this web service was in python with a
	// mongodb backend. Both of those languages are pretty forgiving with using
	// a numeric key in a hash/dict/JSON object. However, Java is not
	// particularly happy about it. So, here we are with properties with numeric
	// names. It's not optimal or pretty, but we're at the mercy of that
	// database design at this point.

	@Embedded("0")
	private HourFromDayOfWeek hour0;

	@Embedded("1")
	private HourFromDayOfWeek hour1;

	@Embedded("2")
	private HourFromDayOfWeek hour2;

	@Embedded("3")
	private HourFromDayOfWeek hour3;

	@Embedded("4")
	private HourFromDayOfWeek hour4;

	@Embedded("5")
	private HourFromDayOfWeek hour5;

	@Embedded("6")
	private HourFromDayOfWeek hour6;

	@Embedded("7")
	private HourFromDayOfWeek hour7;

	@Embedded("8")
	private HourFromDayOfWeek hour8;

	@Embedded("9")
	private HourFromDayOfWeek hour9;

	@Embedded("10")
	private HourFromDayOfWeek hour10;

	@Embedded("11")
	private HourFromDayOfWeek hour11;

	@Embedded("12")
	private HourFromDayOfWeek hour12;

	@Embedded("13")
	private HourFromDayOfWeek hour13;

	@Embedded("14")
	private HourFromDayOfWeek hour14;

	@Embedded("15")
	private HourFromDayOfWeek hour15;

	@Embedded("16")
	private HourFromDayOfWeek hour16;

	@Embedded("17")
	private HourFromDayOfWeek hour17;

	@Embedded("18")
	private HourFromDayOfWeek hour18;

	@Embedded("19")
	private HourFromDayOfWeek hour19;

	@Embedded("20")
	private HourFromDayOfWeek hour20;

	@Embedded("21")
	private HourFromDayOfWeek hour21;

	@Embedded("22")
	private HourFromDayOfWeek hour22;

	@Embedded("23")
	private HourFromDayOfWeek hour23;

	public HourFromDayOfWeek getHour0() {
		return hour0;
	}

	public void setHour0(HourFromDayOfWeek hour0) {
		this.hour0 = hour0;
	}

	public HourFromDayOfWeek getHour1() {
		return hour1;
	}

	public void setHour1(HourFromDayOfWeek hour1) {
		this.hour1 = hour1;
	}

	public HourFromDayOfWeek getHour2() {
		return hour2;
	}

	public void setHour2(HourFromDayOfWeek hour2) {
		this.hour2 = hour2;
	}

	public HourFromDayOfWeek getHour3() {
		return hour3;
	}

	public void setHour3(HourFromDayOfWeek hour3) {
		this.hour3 = hour3;
	}

	public HourFromDayOfWeek getHour4() {
		return hour4;
	}

	public void setHour4(HourFromDayOfWeek hour4) {
		this.hour4 = hour4;
	}

	public HourFromDayOfWeek getHour5() {
		return hour5;
	}

	public void setHour5(HourFromDayOfWeek hour5) {
		this.hour5 = hour5;
	}

	public HourFromDayOfWeek getHour6() {
		return hour6;
	}

	public void setHour6(HourFromDayOfWeek hour6) {
		this.hour6 = hour6;
	}

	public HourFromDayOfWeek getHour7() {
		return hour7;
	}

	public void setHour7(HourFromDayOfWeek hour7) {
		this.hour7 = hour7;
	}

	public HourFromDayOfWeek getHour8() {
		return hour8;
	}

	public void setHour8(HourFromDayOfWeek hour8) {
		this.hour8 = hour8;
	}

	public HourFromDayOfWeek getHour9() {
		return hour9;
	}

	public void setHour9(HourFromDayOfWeek hour9) {
		this.hour9 = hour9;
	}

	public HourFromDayOfWeek getHour10() {
		return hour10;
	}

	public void setHour10(HourFromDayOfWeek hour10) {
		this.hour10 = hour10;
	}

	public HourFromDayOfWeek getHour11() {
		return hour11;
	}

	public void setHour11(HourFromDayOfWeek hour11) {
		this.hour11 = hour11;
	}

	public HourFromDayOfWeek getHour12() {
		return hour12;
	}

	public void setHour12(HourFromDayOfWeek hour12) {
		this.hour12 = hour12;
	}

	public HourFromDayOfWeek getHour13() {
		return hour13;
	}

	public void setHour13(HourFromDayOfWeek hour13) {
		this.hour13 = hour13;
	}

	public HourFromDayOfWeek getHour14() {
		return hour14;
	}

	public void setHour14(HourFromDayOfWeek hour14) {
		this.hour14 = hour14;
	}

	public HourFromDayOfWeek getHour15() {
		return hour15;
	}

	public void setHour15(HourFromDayOfWeek hour15) {
		this.hour15 = hour15;
	}

	public HourFromDayOfWeek getHour16() {
		return hour16;
	}

	public void setHour16(HourFromDayOfWeek hour16) {
		this.hour16 = hour16;
	}

	public HourFromDayOfWeek getHour17() {
		return hour17;
	}

	public void setHour17(HourFromDayOfWeek hour17) {
		this.hour17 = hour17;
	}

	public HourFromDayOfWeek getHour18() {
		return hour18;
	}

	public void setHour18(HourFromDayOfWeek hour18) {
		this.hour18 = hour18;
	}

	public HourFromDayOfWeek getHour19() {
		return hour19;
	}

	public void setHour19(HourFromDayOfWeek hour19) {
		this.hour19 = hour19;
	}

	public HourFromDayOfWeek getHour20() {
		return hour20;
	}

	public void setHour20(HourFromDayOfWeek hour20) {
		this.hour20 = hour20;
	}

	public HourFromDayOfWeek getHour21() {
		return hour21;
	}

	public void setHour21(HourFromDayOfWeek hour21) {
		this.hour21 = hour21;
	}

	public HourFromDayOfWeek getHour22() {
		return hour22;
	}

	public void setHour22(HourFromDayOfWeek hour22) {
		this.hour22 = hour22;
	}

	public HourFromDayOfWeek getHour23() {
		return hour23;
	}

	public void setHour23(HourFromDayOfWeek hour23) {
		this.hour23 = hour23;
	}

}

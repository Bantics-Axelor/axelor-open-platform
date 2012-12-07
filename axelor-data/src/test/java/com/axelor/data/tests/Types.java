package com.axelor.data.tests;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

import com.axelor.db.JpaModel;
import com.google.common.base.Objects;

@Entity
@Table(name = "DATA_TYPES")
public class Types extends JpaModel {

	private LocalDate date;
	
	private LocalTime time;
	
	private LocalDateTime dateTime;
	
	private DateTime dateTimeTz;
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalTime getTime() {
		return time;
	}
	
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	public DateTime getDateTimeTz() {
		return dateTimeTz;
	}
	
	public void setDateTimeTz(DateTime dateTimeTz) {
		this.dateTimeTz = dateTimeTz;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(getClass())
				.add("date", date)
				.add("time", time)
				.add("datetime", dateTime)
				.add("datetime-tz", dateTimeTz)
				.toString();
	}
}

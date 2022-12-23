package com.entity;

import java.time.LocalTime;

public class Flight {
private int flightNo;
private String carrier;
private String source;
private String destination;
private LocalTime departureTime;
private LocalTime arrivalTime;
public int getFlightNo() {
	return flightNo;
}
public void setFlightNo(int flightNo) {
	this.flightNo = flightNo;
}
public String getCarrier() {
	return carrier;
}
public void setCarrier(String carrier) {
	this.carrier = carrier;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public LocalTime getDepartureTime() {
	return departureTime;
}
public void setDepartureTime(LocalTime departureTime) {
	this.departureTime = departureTime;
}
public LocalTime getArrivalTime() {
	return arrivalTime;
}
public void setArrivalTime(LocalTime arrivalTime) {
	this.arrivalTime = arrivalTime;
}

}

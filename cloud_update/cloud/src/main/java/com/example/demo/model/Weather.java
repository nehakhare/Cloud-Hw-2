package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
private String TMAX;
private String TMIN;
private String DATE;

@JsonProperty("TMAX")
public String getTmax() {
	return TMAX;
}
@JsonProperty("TMAX")
public void setTmax(String TMAX) {
	this.TMAX = TMAX;
}
@JsonProperty("TMIN")
public String getTmin() {
	return TMIN;
}
@JsonProperty("TMIN")
public void setTmin(String TMIN) {
	this.TMIN = TMIN;
}
@JsonProperty("DATE")
public String getDate() {
	return DATE;
}
@JsonProperty("DATE")
public void setDate(String DATE) {
	this.DATE = DATE;
}
@Override
public String toString() {
	return "Weather [TMAX=" + TMAX + ", TMIN=" + TMIN + ", DATE=" + DATE + "]";
}


}

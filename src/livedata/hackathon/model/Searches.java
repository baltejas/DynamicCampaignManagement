package livedata.hackathon.model;

import java.util.Map;

public class Searches {
	
	private String origin;
	
	private String destination;
	
	private String market;
	
	private Map<String, Integer> tripDuration;
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getMarket() {
		return market;
	}
	
	public void setMarket(String market) {
		this.market = market;
	}
	
	public Map<String, Integer> getTripDuration() {
		return tripDuration;
	}
	
	public void setTripDuration(Map<String, Integer> tripDuration) {
		this.tripDuration = tripDuration;
	}
	
}

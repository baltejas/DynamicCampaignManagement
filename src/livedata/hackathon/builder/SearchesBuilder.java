package livedata.hackathon.builder;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import livedata.hackathon.model.Searches;

public class SearchesBuilder {

	public static Searches build() {
		Searches searches = new Searches();
		searches.setDestination("RIO");
		searches.setOrigin("SAO");
		searches.setMarket("BR");

		Map<String, Integer> tripDuration = new HashMap<String, Integer>();
		tripDuration.put("1", RandNumTill1000());
		tripDuration.put("2", RandNumTill1000());
		tripDuration.put("3", RandNumTill1000());
		tripDuration.put("4", RandNumTill1000());
		tripDuration.put("5", RandNumTill1000());
		tripDuration.put("6", RandNumTill1000());
		tripDuration.put("7", RandNumTill1000());
		tripDuration.put("8", RandNumTill100());
		tripDuration.put("9", RandNumTill100());
		tripDuration.put("10", RandNumTill100());
		tripDuration.put("11", RandNumTill100());
		tripDuration.put("12", RandNumTill100());
		tripDuration.put("13", RandNumTill100());
		tripDuration.put("14", RandNumTill100());
		tripDuration.put("15", RandNumTill100());
		tripDuration.put("16", RandNumTill100());
		tripDuration.put("17", RandNumTill100());
		tripDuration.put("18", RandNumTill100());
		tripDuration.put("19", RandNumTill100());
		tripDuration.put("20", RandNumTill10());
		tripDuration.put("21", RandNumTill10());
		tripDuration.put("22", RandNumTill10());
		tripDuration.put("23", RandNumTill10());
		tripDuration.put("24", RandNumTill10());
		tripDuration.put("25", RandNumTill10());
		tripDuration.put("26", RandNumTill10());
		tripDuration.put("27", RandNumTill10());
		tripDuration.put("28", RandNumTill10());
		tripDuration.put("29", RandNumTill10());
		tripDuration.put("30", RandNumTill10());
		searches.setTripDuration(tripDuration);
		return searches;

	}
	
	public static Random numGen =new Random();

	public static int RandNumTill1000(){
	    int rand = Math.abs((1000)+numGen.nextInt(1000));

	    return rand;
	}
	
	public static int RandNumTill100(){
	    int rand = Math.abs((100)+numGen.nextInt(100));

	    return rand;
	}
	
	public static int RandNumTill10(){
	    int rand = Math.abs((10)+numGen.nextInt(10));

	    return rand;
	}
}

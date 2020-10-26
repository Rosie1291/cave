/**
 * Name: Nhung Nguyen  
 * Date: 10/25/2020
 * Class: CS 226 009 Data Structures and Algorithms
 * Assignment6: Chapter 6: Caves
 * Purpose:  Cave object containing Cave Name and Cave GPS coordinates (Latitude and Longitude)
and any other appropriate attributes if needed
 */
package nnguyen;

public class Cave<T> {

	String caveName;
	double longitude; 
	double latitude;
	
	private Cave next;
	
	public Cave(String caveName, Cave linkPortion, double longitude, double latitude) {
		next = linkPortion;
		this.caveName = caveName;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public Cave getNextCave() {
		return next;
	}

	public String getCaveName() {
		return caveName + " Cave GPS coordinates: " + getLongitude() + "," + getLatitude();
	}

	public double getLongitude() {
		return longitude;
	}

	public double getLatitude() {
		return latitude;
	}
}

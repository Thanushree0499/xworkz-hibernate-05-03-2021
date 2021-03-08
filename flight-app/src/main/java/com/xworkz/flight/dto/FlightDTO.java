package com.xworkz.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight_table")
public class FlightDTO implements java.io.Serializable {
    
	@Column(name="FLIGHTID")
	@Id
	int flightId;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="SOURCE")
	String source;
	
	@Column(name="DESTINATION")
	String destination;
	
	@Column(name="FUELCAPACITY")
	int fuelCapacity;
	
	public FlightDTO(){
		
	}

	public FlightDTO(int flightId, String name, String source, String destination, int fuelCapacity) {
		super();
		this.flightId = flightId;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.fuelCapacity = fuelCapacity;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	@Override
	public String toString() {
		return "FlightDTO [flightId=" + flightId + ", name=" + name + ", source=" + source + ", destination="
				+ destination + ", fuelCapacity=" + fuelCapacity + "]";
	}
	
}

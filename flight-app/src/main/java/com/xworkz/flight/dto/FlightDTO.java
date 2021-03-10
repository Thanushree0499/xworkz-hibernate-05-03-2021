package com.xworkz.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight_table")
public class FlightDTO implements java.io.Serializable {
    
	@Column(name="FLIGHTID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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

	public FlightDTO(String name, String source, String destination, int fuelCapacity) {
		super();
		
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.fuelCapacity = fuelCapacity;
	}

	public int getFlightId() {
		return flightId;
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

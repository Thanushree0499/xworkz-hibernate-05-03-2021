package com.xworkz.flight.dao;

import com.xworkz.flight.dto.FlightDTO;

public interface FlightDAO {
	
    void saveFlight(FlightDTO flightDTO);
	
	void readFlight(int flightId);
	
	void updateFlight(int flightId);
	
	void deleteFlight(int flightId);

}

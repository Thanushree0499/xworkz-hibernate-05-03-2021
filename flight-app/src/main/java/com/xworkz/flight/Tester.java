package com.xworkz.flight;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;
import com.xworkz.flight.service.FlightService;
import com.xworkz.flight.service.FlightServiceImpl;

public class Tester {

	public static void main(String[] args) {
	  FlightDTO flightDTO=new FlightDTO("BritishAirways","Bangalore","Delhi",200);
	  FlightDAO flightDAO=new FlightDAOImpl();
	  FlightService flightService=new FlightServiceImpl(flightDAO);
	 
	  flightService.validateAndSaveFlight(flightDTO);
	 // flightService.validateAndReadFlight(flightDTO);
	 // flightService.validateAndUpdateFlight(flightDTO);
	 // flightService.validateAndDeleteFlight(flightDTO);
	  
	  
	}

}

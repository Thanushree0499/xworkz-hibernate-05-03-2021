package com.xworkz.flight;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;

public class Tester {

	public static void main(String[] args) {
	  FlightDTO flightDTO=new FlightDTO(2,"British Airways","Bangalore","Delhi",200);
	  FlightDAO flightDAO=new FlightDAOImpl();
	  //flightDAO.saveFlight(flightDTO);
	 // flightDAO.updateFlight(1);
	  flightDAO.readFlight(1);
	  //flightDAO.deleteFlight(2);

	}

}

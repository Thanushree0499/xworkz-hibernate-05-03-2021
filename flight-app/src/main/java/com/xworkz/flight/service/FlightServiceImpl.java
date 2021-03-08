package com.xworkz.flight.service;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dto.FlightDTO;

public class FlightServiceImpl implements FlightService {
	
	private FlightDAO flightDAO;
	
	FlightServiceImpl(FlightDAO flightDAO){
		this.flightDAO=flightDAO;
	}

	@Override
	public boolean validateAndSaveFlight(FlightDTO flightDTO) {
		boolean validData = false;
		if(flightDTO!=null) {
			System.out.println("dto is not null, will validate fields");
			int flightId=flightDTO.getFlightId();
			if (flightId > 0) {
				System.out.println("flightId is valid");
				validData = true;
			} else {
				System.out.println("flightId is invalid");
				validData = false;
			}
			if (validData) {
				String name = flightDTO.getName();
				if (name != null && name.length() >= 2 && !name.isEmpty() && !name.contains(" ")) {
					System.out.println("name is valid");
					validData = true;
				} else {
					System.out.println("name is invalid");
					validData = false;
				}
			}
			if (validData) {
				String source = flightDTO.getSource();
				if (source != null && source.length() >= 2 && !source.isEmpty() && !source.contains(" ")) {
					System.out.println("source is valid");
					validData = true;
				} else {
					System.out.println("source is invalid");
					validData = false;
				}
			}
			if (validData) {
				String destination = flightDTO.getDestination();
				if (destination != null && destination.length() >= 2 && !destination.isEmpty() && !destination.contains(" ")) {
					System.out.println("destination is valid");
					validData = true;
				} else {
					System.out.println("destination is invalid");
					validData = false;
				}
			}
			if (validData) {
				double fuelCapacity = flightDTO.getFuelCapacity();
				if (fuelCapacity > 0) {
					System.out.println("fuelCapacity is valid");
					validData = true;
				} else {
					System.out.println("fuelCapacity is invalid");
					validData = false;
				}

			}
			
			if (validData) {
				System.out.println("data is valid , can invoke flightdao");
				flightDAO.saveFlight(flightDTO);
			} else {
				System.out.println("flightDTO is null, invalid data");
			}
		}
		return false;
	}

	@Override
	public boolean validateAndReadFlight(FlightDTO flightDTO) {
		int flightId=0;
		boolean validData = false;
		if (flightDTO != null) {
			System.out.println("dto is not null, will validate fields");
			flightId=flightDTO.getFlightId();
	        if(flightId > 0) {
			    System.out.println("flightId is valid");
			    validData = true;
		    } else {
			    System.out.println("flightId is invalid");
			    validData = false;
		}
		}if (validData) {
			System.out.println("data is valid , can invoke flightdao");
			flightDAO.readFlight(flightId);
		} else {
			System.out.println("flightDTO is null, invalid data");
		}
		return false;
	}

	@Override
	public boolean validateAndUpdateFlight(FlightDTO flightDTO) {
		int flightId=0;
		boolean validData = false;
		if (flightDTO != null) {
			System.out.println("dto is not null, will validate fields");
			flightId=flightDTO.getFlightId();
	        if(flightId > 0) {
			    System.out.println("flightId is valid");
			    validData = true;
		    } else {
			    System.out.println("flightId is invalid");
			    validData = false;
		}
		}if (validData) {
			System.out.println("data is valid , can invoke flightdao");
			flightDAO.updateFlight(flightId);
		} else {
			System.out.println("flightDTO is null, invalid data");
		}
		return false;
	}

	@Override
	public boolean validateAndDeleteFlight(FlightDTO flightDTO) {
		int flightId=0;
		boolean validData = false;
		if (flightDTO != null) {
			System.out.println("dto is not null, will validate fields");
			flightId=flightDTO.getFlightId();
	        if(flightId > 0) {
			    System.out.println("flightId is valid");
			    validData = true;
		    } else {
			    System.out.println("flightId is invalid");
			    validData = false;
		}
		}if (validData) {
			System.out.println("data is valid , can invoke flightdao");
			flightDAO.deleteFlight(flightId);
		} else {
			System.out.println("flightDTO is null, invalid data");
		}
		return false;
	}

}

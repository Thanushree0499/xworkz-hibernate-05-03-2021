package com.xwork.mobile.service;

import com.xwork.mobile.dao.MobilesDAO;
import com.xwork.mobile.dao.MobilesDAOImpl;
import com.xwork.mobile.dto.MobileDTO;

public class MobileServiceImpl implements MobileService {

	private MobilesDAO mobilesDAO;

	public MobileServiceImpl(MobilesDAO mobilesDAO) {
		this.mobilesDAO = mobilesDAO;
	}

	@Override
	public boolean validateAndSaveMobile(MobileDTO mobileDTO) {
		boolean validData = false;
		if (mobileDTO != null) {
			System.out.println("dto is not null, will validate fields");
			int mobileId = mobileDTO.getMobileId();
			if (mobileId > 0) {
				System.out.println("mobileId is valid");
				validData = true;
			} else {
				System.out.println("mobileId is invalid");
				validData = false;
			}
		}
		if (validData) {
			String brand = mobileDTO.getBrand();
			if (brand != null && brand.length() >= 2 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is invalid");
				validData = false;
			}
		}
		if (validData) {
			String mobileSeriesName = mobileDTO.getMobileSeriesName();
			if (mobileSeriesName != null && mobileSeriesName.length() >= 4 && !mobileSeriesName.isEmpty()
					&& !mobileSeriesName.contains(" ")) {
				System.out.println("mobileSeriesName is valid");
				validData = true;
			} else {
				System.out.println("mobileSeriesName is invalid");
				validData = false;
			}

		}
		if (validData) {
			double price = mobileDTO.getPrice();
			if (price > 0) {
				System.out.println("price is valid");
				validData = true;
			} else {
				System.out.println("price is invalid");
				validData = false;
			}

		}
		if (validData) {
			String color = mobileDTO.getColor();
			if (color != null && color.length() >= 3 && !color.isEmpty() && !color.contains(" ")) {
				System.out.println("color is valid");
				validData = true;
			} else {
				System.out.println("color is invalid");
				validData = false;
			}
		}
		if (validData) {
			double batteryCapacity = mobileDTO.getBatteryCapacity();
			if (batteryCapacity > 0 && batteryCapacity <= 7000) {
				System.out.println("batteryCapacity is valid");
				validData = true;
			} else {
				System.out.println("batteryCapacity is invalid");
				validData = false;
			}

		}
		if (validData) {
			System.out.println("data is valid , can invoke mobiledao");
			mobilesDAO.saveMobile(mobileDTO);
		} else {
			System.out.println("mobiledto is null, invalid data");
		}
		return false;
	}

}

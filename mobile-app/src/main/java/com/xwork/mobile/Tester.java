package com.xwork.mobile;

import com.xwork.mobile.dao.MobilesDAO;
import com.xwork.mobile.dao.MobilesDAOImpl;
import com.xwork.mobile.dto.MobileDTO;
import com.xwork.mobile.service.MobileService;
import com.xwork.mobile.service.MobileServiceImpl;

public class Tester {

	public static void main(String[] args) {
		MobileDTO mobileDTO =new MobileDTO("redmi","redmiNote7",20000,"white",4500);
		MobilesDAO mobilesDAO=new MobilesDAOImpl();
		
		MobileService mobileService=new MobileServiceImpl(mobilesDAO);

		mobileService.validateAndSaveMobile(mobileDTO);
		//mobileService.validateAndRead(mobileDTO);
		//mobileService.validateAndUpdate(mobileDTO);
		//mobileService.validateAndDelete(mobileDTO);

	}

}

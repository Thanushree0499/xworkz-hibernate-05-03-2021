package com.xwork.mobile.dao;

import com.xwork.mobile.dto.MobileDTO;

public interface MobilesDAO {
	
	void saveMobile(MobileDTO mobileDTO);
	
	void readMobile(int mobileId);
	
	void updateMobile(int mobileId);
	
	void deleteMobile(int mobileId);
}

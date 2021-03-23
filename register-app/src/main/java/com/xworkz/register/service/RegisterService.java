package com.xworkz.register.service;

import com.xworkz.register.dto.RegisterDTO;

public interface RegisterService {

	public boolean validateAndSaveUserData(RegisterDTO registerDTO);
}

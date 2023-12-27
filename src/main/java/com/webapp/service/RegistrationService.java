package com.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.Repository.RegistrationRepository;
import com.webapp.entity.Registration;

@Service
public class RegistrationService {
  
	@Autowired
	 private RegistrationRepository registrationService;

	public void saveRegistration(Registration registration) {
		registrationService.save(registration);
	}
}
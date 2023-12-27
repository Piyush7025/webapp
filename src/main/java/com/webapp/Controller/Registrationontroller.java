package com.webapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.dto.RegistrationDto;
import com.webapp.entity.Registration;
import com.webapp.service.RegistrationService;

@Controller
public class Registrationontroller {
	@Autowired
	private RegistrationService registrationService;
	
	//http://localhost:8080/view-registration-page
      @RequestMapping("/view-registration-page")
	public String viewsRegistrationPage () {
		return "newregistration";
	}
      
//      @RequestMapping("/saveReg")
//      public String saveRegistration(Registration registration) {
//    	  registrationService.saveRegistration(registration);
//   	     return "newregistration";
//      }
      
      @RequestMapping("/saveReg")
      public String saveRegistration(RegistrationDto dto,ModelMap model) {
    	  Registration registration = new Registration();
    	  registration.setFirstName(dto.getFirstName());
    	  registration.setLastName(dto.getLastName());
    	  registration.setEmail(dto.getEmail());
    	  registration.setMobile(dto.getMobile());
    	  registrationService.saveRegistration(registration);
    	  model.addAttribute("msg","Recorded save");
   	     return "newregistration";
   	     
      }
}

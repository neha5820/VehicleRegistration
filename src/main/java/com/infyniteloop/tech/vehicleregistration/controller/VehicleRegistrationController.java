package com.infyniteloop.tech.vehicleregistration.controller;
import com.infyniteloop.tech.vehicleregistration.model.Insurer;
import com.infyniteloop.tech.vehicleregistration.model.RegistrationResponse;
import com.infyniteloop.tech.vehicleregistration.model.Registrations;
import com.infyniteloop.tech.vehicleregistration.service.VehicleRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/registration")
public class VehicleRegistrationController {

    @Autowired
    VehicleRegistrationService service;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<RegistrationResponse> getList( HttpServletRequest request)
    {

        //Optional<VehicleRegistrationService> records = service.getRegistrations();
        List<Registrations> records = service.getRegistrations();
        //List<Insurer> recordsInsurer = service.getRegistrations();
        RegistrationResponse registrationResponse = new RegistrationResponse();
        registrationResponse.setRegistrationsList(records);

        return new ResponseEntity(registrationResponse, HttpStatus.OK);
        //return new ResponseEntity<>(records.get(), HttpStatus.OK);

    }

    // @RequestMapping(value = "/pi/name/{firstName}", method = RequestMethod.GET)
    //public ResponseEntity<PersonalInformation> getPersonalInfoAll( @PathVariable("firstName") String firstName,HttpServletRequest request)
    //{

    //  List<PersonalInformation> records = service.getPersonalInfoByName(firstName);

    //return new ResponseEntity(records, HttpStatus.OK);

    //}

    //@RequestMapping(value = "/pi", method = RequestMethod.GET)
    //public ResponseEntity<PersonalInformation> getPersonalInfoAll( HttpServletRequest request)
    //{

    //  List<PersonalInformation> records = service.getPersonalInfoAll();

    //return new ResponseEntity(records, HttpStatus.OK);

    //}


}

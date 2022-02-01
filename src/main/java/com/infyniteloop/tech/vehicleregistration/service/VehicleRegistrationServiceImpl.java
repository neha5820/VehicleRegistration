package com.infyniteloop.tech.vehicleregistration.service;
import com.infyniteloop.tech.vehicleregistration.model.Insurer;
import com.infyniteloop.tech.vehicleregistration.model.RegistrationResponse;
import com.infyniteloop.tech.vehicleregistration.model.Registrations;
import com.infyniteloop.tech.vehicleregistration.model.Vehicle;
import com.infyniteloop.tech.vehicleregistration.repository.VehicleRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleRegistrationServiceImpl implements VehicleRegistrationService{

    @Autowired
    VehicleRegistrationRepository repo;
//    @Autowired
//    InsurerRepository repo1;
//    @Autowired
//    VehicleRepository repo2;




    public List<Registrations> getRegistrations()
    {
        List<Registrations> registrations = repo.findAll();

        return registrations;
    }






}

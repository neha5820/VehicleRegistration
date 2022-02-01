package com.infyniteloop.tech.vehicleregistration.service;
import com.infyniteloop.tech.vehicleregistration.model.Registrations;
import com.infyniteloop.tech.vehicleregistration.model.Vehicle;
import com.infyniteloop.tech.vehicleregistration.model.Insurer;
import java.util.List;
import java.util.Optional;


public interface VehicleRegistrationService {
    public List<Registrations> getRegistrations();
//    public List<Insurer> getInsurer();
//    public List<Vehicle> getVehicle();
//    public List<Vehicle> getVehiclebyNumberPlate(String number_plate);
}

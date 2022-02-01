package com.infyniteloop.tech.vehicleregistration.model;

import java.util.List;

public class RegistrationResponse {


    private List<Registrations> registrationsList;


    public List<Registrations> getRegistrationsList() {
        return registrationsList;
    }

    public void setRegistrationsList(List<Registrations> registrationsList) {
        this.registrationsList = registrationsList;
    }
}

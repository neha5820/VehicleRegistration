package com.infyniteloop.tech.vehicleregistration.repository;

import com.infyniteloop.tech.vehicleregistration.model.Registrations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRegistrationRepository extends JpaRepository<Registrations,Long> {


}
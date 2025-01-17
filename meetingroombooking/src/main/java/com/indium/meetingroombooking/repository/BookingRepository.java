package com.indium.meetingroombooking.repository;

import com.indium.meetingroombooking.entity.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking,Integer> {
}

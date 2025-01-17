package com.indium.meetingroombooking.repository;

import com.indium.meetingroombooking.entity.RecurrenceMappingDetails;
import org.springframework.data.repository.CrudRepository;

public interface RecurrenceMappingRepository extends CrudRepository<RecurrenceMappingDetails,Integer> {
}

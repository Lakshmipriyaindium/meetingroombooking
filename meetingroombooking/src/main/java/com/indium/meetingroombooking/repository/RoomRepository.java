package com.indium.meetingroombooking.repository;

import com.indium.meetingroombooking.entity.RoomDetails;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<RoomDetails,Integer> {
}

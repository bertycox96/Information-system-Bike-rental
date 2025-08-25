package com.hnure.repository;

import com.hnure.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {

}

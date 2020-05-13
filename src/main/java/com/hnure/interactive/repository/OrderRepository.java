package com.hnure.interactive.repository;

import com.hnure.interactive.jpa.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Purchase, Long> {}

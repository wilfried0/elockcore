package com.assam.elockcore.repository;

import com.assam.elockcore.entity.ElockIndication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElockIndicationRepository extends JpaRepository<ElockIndication, Long> {
    
}

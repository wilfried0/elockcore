package com.assam.elockcore.repository;

import com.assam.elockcore.entity.ElockContreIndication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElockContreIndicationRepository extends JpaRepository<ElockContreIndication, Long> {
    
}

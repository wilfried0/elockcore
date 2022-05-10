package com.assam.elockcore.repository;

import com.assam.elockcore.entity.Elock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElockRepository extends JpaRepository<Elock, Long> {
    
}
package com.assam.elockcore.repository;

import com.assam.elockcore.entity.ElockLangue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElockLangueRepository extends JpaRepository<ElockLangue, Long> {
    
}

package com.cg.mts.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.mts.entities.Cab;



public interface ICabRepository extends JpaRepository<Cab, Integer>{

}
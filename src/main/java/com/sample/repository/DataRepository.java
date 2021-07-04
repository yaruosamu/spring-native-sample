package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.model.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Integer> {}

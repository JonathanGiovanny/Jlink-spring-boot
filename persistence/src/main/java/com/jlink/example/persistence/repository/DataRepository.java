package com.jlink.example.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlink.example.model.DataEntity;

public interface DataRepository extends JpaRepository<DataEntity, Long> {

}

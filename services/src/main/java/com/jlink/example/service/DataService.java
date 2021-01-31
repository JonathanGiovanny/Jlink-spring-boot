package com.jlink.example.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jlink.example.model.DataEntity;

public interface DataService {

	Optional<DataEntity> getData(Long id);

	Page<DataEntity> getAll(Pageable pageable);

	DataEntity saveData(DataEntity data);

}

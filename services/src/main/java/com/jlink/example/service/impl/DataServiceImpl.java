package com.jlink.example.service.impl;

import java.util.Objects;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jlink.example.model.DataEntity;
import com.jlink.example.persistence.repository.DataRepository;
import com.jlink.example.service.DataService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService {

	private final @NonNull DataRepository dataRepository;

	@Override
	public Optional<DataEntity> getData(Long id) {
		Objects.requireNonNull(id);
		return dataRepository.findById(id);
	}

	@Override
	public Page<DataEntity> getAll(Pageable pageable) {
		log.debug("Getting all the Data");
		Objects.requireNonNull(pageable);
		return dataRepository.findAll(pageable);
	}

	@Override
	public DataEntity saveData(DataEntity data) {
		Objects.requireNonNull(data);
		return dataRepository.save(data);
	}

}

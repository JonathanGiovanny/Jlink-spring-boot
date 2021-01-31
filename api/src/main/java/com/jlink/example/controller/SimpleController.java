package com.jlink.example.controller;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jlink.example.dto.Data;
import com.jlink.example.mapper.DataMapper;
import com.jlink.example.service.DataService;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@RestController
@RequestMapping("simple")
@AllArgsConstructor
public class SimpleController {

	private final @NonNull DataService dataService;
	private final @NonNull DataMapper dataMapper;

	@GetMapping("{id}")
	public Data getData(@PathVariable Long id) {
		return dataService.getData(id)
				.map(dataMapper::entityToDto)
				.orElseThrow(() -> new EntityNotFoundException(String.format("Data not found with id: %d", id)));
	}

	@GetMapping
	public Page<Data> getAll(@PageableDefault(size = 20) Pageable pageable) {
		return dataService.getAll(pageable)
				.map(dataMapper::entityToDto);
	}

	@PostMapping
	public Data createData(@RequestBody Data data) {
		return dataMapper.entityToDto(dataService.saveData(dataMapper.dtoToEntity(data)));
	}

	@PutMapping("{id}")
	public Data updateData(@PathVariable Long id, @RequestBody Data data) {
		data.setId(id);
		return dataMapper.entityToDto(dataService.saveData(dataMapper.dtoToEntity(data)));
	}

}

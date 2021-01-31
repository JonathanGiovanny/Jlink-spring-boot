package com.jlink.example.mapper;

import org.mapstruct.Mapper;

import com.jlink.example.dto.Data;
import com.jlink.example.model.DataEntity;

@Mapper(componentModel = "spring")
public interface DataMapper {

	DataEntity dtoToEntity(Data data);

	Data entityToDto(DataEntity entity);

}

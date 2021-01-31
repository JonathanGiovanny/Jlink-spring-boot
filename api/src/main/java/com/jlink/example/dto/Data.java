package com.jlink.example.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Data implements Serializable {

	private static final long serialVersionUID = 6175047089150048793L;

	private Long id;
	private String name;

}

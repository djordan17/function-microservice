package com.function.app.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class CompanyRs {
	
	private String id;
	private String name;
	private LocalDate date;

}

package com.function.app.service.impl;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.function.app.model.CompanyRq;
import com.function.app.model.CompanyRs;
import com.function.app.service.CompanyService;

@Service
public class BasicCompanyService implements CompanyService {

	@Override
	public CompanyRs getInformationByName(CompanyRq companyRq) {
		return CompanyRs.builder()
				.id(UUID.randomUUID().toString())
				.name(companyRq.getName().toUpperCase())
				.date(LocalDate.now())
				.build();
	}

}

package com.function.app.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.function.app.model.CompanyRq;
import com.function.app.model.CompanyRs;
import com.function.app.service.CompanyService;

public class BasicCompanyServiceTest {
	
	private CompanyService companyService = new BasicCompanyService();
	
	@Test
	public void shouldReturnCompanyInformatio_WhenInvokeNameCompanyParameter() {
		CompanyRq request = new CompanyRq();
		request.setName("Coca Cola");
		CompanyRs companyRs = companyService.getInformationByName(request);
		assertEquals(LocalDate.now(), companyRs.getDate());
	}

}

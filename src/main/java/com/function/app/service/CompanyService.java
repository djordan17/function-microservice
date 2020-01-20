package com.function.app.service;

import com.function.app.model.CompanyRq;
import com.function.app.model.CompanyRs;

public interface CompanyService {
	
	CompanyRs getInformationByName(CompanyRq companyRq);

}

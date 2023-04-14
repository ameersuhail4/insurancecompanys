package com.claimManagement.insuranceCompany;

import com.claimManagement.insuranceCompany.daoImp.PolicyDAOImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InsuranceCompanyApplication implements CommandLineRunner {
	@Autowired
	PolicyDAOImp policyDAOImp;
	public static void main(String[] args) {
		SpringApplication.run(InsuranceCompanyApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		policyDAOImp.policyInsert();
	}
}

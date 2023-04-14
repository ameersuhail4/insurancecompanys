package com.claimManagement.insuranceCompany.daoImp;

import com.claimManagement.insuranceCompany.dao.PolicyDAO;
import com.claimManagement.insuranceCompany.entities.ClaimDetails;
import com.claimManagement.insuranceCompany.entities.Policy;
import com.claimManagement.insuranceCompany.repositories.PolicyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class PolicyDAOImp implements PolicyDAO {
    @Autowired
     PolicyRepository policyRepository;
    @Override
    public void policyInsert() {
        ClaimDetails claimDetails=new ClaimDetails();

        Policy p=new Policy("1","shaik ameer","suhail",LocalDate.of(2023,4,13),"ameer4@gmail.com","Ap02",false);
       Policy p1=policyRepository.save(p);
        System.out.println(p1);
    }
}

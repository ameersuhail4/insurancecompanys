package com.claimManagement.insuranceCompany.repositories;

import com.claimManagement.insuranceCompany.entities.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface PolicyRepository extends JpaRepository<Policy,String> {

}

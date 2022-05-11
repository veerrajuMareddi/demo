package com.corp.OilcorpRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corp.OilcorpModel.OilCorp;
import com.corp.OilcorpModel.OilCorpEmployees;

public interface Repository extends JpaRepository<OilCorp, Integer>
{
 OilCorp getByEmp(OilCorp emp);

OilCorp findByEmp(OilCorpEmployees id);
}

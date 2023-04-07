package com.jsp.idfcmock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.idfcmock.dto.EmployeeDto;

@Repository
public interface UserRepository extends JpaRepository<EmployeeDto, Integer>{

}

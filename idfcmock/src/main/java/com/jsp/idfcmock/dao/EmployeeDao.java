package com.jsp.idfcmock.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.idfcmock.dto.EmployeeDto;
import com.jsp.idfcmock.repository.UserRepository;

@Component
public class EmployeeDao {
	@Autowired
	UserRepository repository;
	
	public void insert( EmployeeDto dto) {
		repository.save(dto);
	}
	

	public String delete(EmployeeDto dto) {
		repository.delete(dto);
		return  "Data successfuly deleted";
	}


	public EmployeeDto fetch(EmployeeDto dto2) {
		Optional<EmployeeDto> dto=repository.findById(dto2.getEmpId());
		return dto.get();
	}
}

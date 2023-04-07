package com.jsp.idfcmock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.idfcmock.dao.EmployeeDao;
import com.jsp.idfcmock.dto.EmployeeDto;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao;
	
	@PostMapping("/insert")
	public void insertData(@RequestBody  EmployeeDto dto) {
		dao.insert(dto);
	}
	
	@DeleteMapping("/delete")
	public String deleteData(@RequestBody EmployeeDto dto) {
		String msg=dao.delete(dto);
		return msg;
	}
	
	@DeleteMapping("/fetch")
	public EmployeeDto fetchData(@RequestBody EmployeeDto dto) {
		EmployeeDto dto2=dao.fetch(dto);
		return dto2;
	}

}

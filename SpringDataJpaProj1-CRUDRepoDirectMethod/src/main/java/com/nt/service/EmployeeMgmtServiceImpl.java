package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.EmployeeDTO;
import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepository empRepo;
	
	@Override
	public int registerEmp(EmployeeDTO dto) {
		Employee entity=new Employee();
		//copy properties
		BeanUtils.copyProperties(dto, entity);
		
		return empRepo.save(entity).getEno();
	}

}

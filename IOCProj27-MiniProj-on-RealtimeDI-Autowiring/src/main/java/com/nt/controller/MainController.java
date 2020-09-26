package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerMgmtService;
import com.nt.vo.CustomerVO;

public final class MainController {
	private CustomerMgmtService service;
	
   //constructor injection
	public MainController(CustomerMgmtService service) {
		this.service = service;
	}
	
	public String processCustomer(CustomerVO vo) throws Exception{
		CustomerDTO dto=null;
		String result=null;
		//convert vo class object to dto class object
		dto=new CustomerDTO();
		//
		//set values to dto object
		dto.setcAdd(vo.getCname());
		dto.setCname(vo.getcAdd());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getTime()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		//use service class
		result=service.CalculateInterestAmount(dto);
		
		return result;
				
	}
	

}

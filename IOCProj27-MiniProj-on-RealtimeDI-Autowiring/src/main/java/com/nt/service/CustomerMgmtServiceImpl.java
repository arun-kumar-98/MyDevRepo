package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements CustomerMgmtService {
	private CustomerDAO dao;
	//constructor injection
	public CustomerMgmtServiceImpl(CustomerDAO dao) {
		this.dao = dao;
	}
	@Override
	public String CalculateInterestAmount(CustomerDTO dto) throws Exception {
		float intAmt=0.0f;
		CustomerBO bo;
		int count=0;
		//calculate interest amount 
		intAmt=(dto.getpAmt()*dto.getRate()*dto.getTime())/100.0f;
		
		//prepare customerBO having persistable data
		bo=new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setcAdd(dto.getcAdd());
		bo.setpAmt(dto.getpAmt());
		bo.setInterest(intAmt);
		//use DAO object
		count=dao.insert(bo);
		//process the result
		if(count==0)
			return "Cusotomer registration failled:Amt" +dto.getpAmt()+"interest:" +intAmt;
		else 
			return "Customer registration succeeded:Amt::" +dto.getpAmt()+"interest" +intAmt;		
	}

}

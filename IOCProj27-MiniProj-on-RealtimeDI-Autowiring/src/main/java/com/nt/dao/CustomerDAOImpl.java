package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
	private static final String CUSTOMER_INSERT_QUERY="INSERT INTO SPRING_CUSTOMER VALUES(CNO_SEQ1.NEXTVAL,?,?,?,?)";
	private DataSource ds;
	
   //constructor injection
	public CustomerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	public int insert(CustomerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get pooled connection
		con=ds.getConnection();
		//create prepare Statement object
		ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);
		//set values to query
		ps.setString(1, bo.getCname());
		ps.setString(2, bo.getcAdd());
		ps.setFloat(3, bo.getpAmt());
		ps.setFloat(4, bo.getInterest());
		//excecute sql query
		count=ps.executeUpdate();
		//close jdbc objects
		ps.close();
		con.close();
		
		return count;
	}

}

package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		Scanner sc=null;
		String name=null,cadd=null,pamt=null,rate=null,time=null;
		CustomerVO vo=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MainController controller=null;
		String result=null;
		//read inputs
		 sc=new Scanner(System.in);
		 System.out.println("enter customer name::");
		 name=sc.next();
		 System.out.println("enter customer address::");
		 cadd=sc.next();
		 System.out.println("enter customer principle amount::");
		 pamt=sc.next();
		 System.out.println("enter customer rate of  interest::");
		 rate=sc.next();
		 System.out.println("enter time::");
		 time=sc.next();
		 //set values to customerVO object
		 vo=new CustomerVO();
		 vo.setCname(name);
		 vo.setcAdd(cadd);
		 vo.setpAmt(pamt);
		 vo.setRate(rate);
		 vo.setTime(time);
		 
		 //create     IOC container bean factory object
		 factory=new DefaultListableBeanFactory();
		 reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		 //get controller bean class object
		 controller=factory.getBean("controller",MainController.class);
		 //invoke method
		 
		 try {
			 result=controller.processCustomer(vo);
			 System.out.println(result);
		 }
		 catch (Exception e) {
			System.out.println("internal db problem");
			e.printStackTrace();
			
		}
		 

	}//main

}//class

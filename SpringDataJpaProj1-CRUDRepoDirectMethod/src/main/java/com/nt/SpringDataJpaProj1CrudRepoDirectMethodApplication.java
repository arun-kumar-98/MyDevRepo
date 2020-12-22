package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;

@SpringBootApplication
public class SpringDataJpaProj1CrudRepoDirectMethodApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringDataJpaProj1CrudRepoDirectMethodApplication.class, args);
		//get bean object
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		//invoke method
		EmployeeDTO dto=new EmployeeDTO("Alok", "patna", 15000.0f);
		System.out.println(service.registerEmp(dto));
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}

package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;

@SpringBootApplication
public class SpringDataJpaProj1CrudRepoDirectMethodApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataJpaProj1CrudRepoDirectMethodApplication.class, args);
		// get bean object
		IEmployeeMgmtService service = ctx.getBean("empService", IEmployeeMgmtService.class);
		// invoke method

		EmployeeDTO dto = new EmployeeDTO("Alok", "patna", 15000.0f);
		System.out.println(service.registerEmp(dto));

		// register group of employee

		
		 /* int[] ids=service.registerGroupOfEmp(List.of(new
		  EmployeeDTO("akash","hyd",30000.0f), new EmployeeDTO("aryan", "hyd",
		  32000.0f),new EmployeeDTO("rahuldev", "hyd", 23000.0f)));
		  System.out.println(Arrays.toString(ids));*/
		 

		// System.out.println("employee count "+service.getEmployeeCount());

		// System.out.println("delete by id" +service.deleteEmpById(45));
		/*
		 * Optional<EmployeeDTO> optDTO=service.getEmpById(22); if(optDTO.isPresent()) {
		 * System.out.println("record found"+optDTO.get()); } else {
		 * System.out.println("record not found"); }
		 */
		// System.out.println(service.removeEmpById(46));

		// service.getAllEmp().forEach(System.out::println);
		/*
		 * service.getAllEmp().forEach(dto->{ System.out.println(dto); });
		 */

		/*
		 * try { service.removeEmpByEntities(List.of(new EmployeeDTO(44)));
		 * 
		 * } catch (Exception e) {
		 * System.out.println("problem in bulk record deletion"); e.printStackTrace();
		 * 
		 * }
		 */

		// service.getEmpById(List.of(47,48,49)).forEach(System.out::println);

		// close container
		((ConfigurableApplicationContext) ctx).close();
	}

}

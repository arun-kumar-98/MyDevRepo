package com.nt.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements Serializable {
	
	private Integer eno;
	@NonNull
	private String ename;
	@NonNull
	private String eadd;
	@NonNull
	private Float esal;
	public EmployeeDTO(Integer eno) {
		this.eno = eno;
	}
	
	

}

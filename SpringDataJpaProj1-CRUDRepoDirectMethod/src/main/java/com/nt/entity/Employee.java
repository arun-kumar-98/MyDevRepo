package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="EMPLOYEE")
@Data
public class Employee implements Serializable {
	
	@Id
	@SequenceGenerator(name = "hibernate_seq",allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "hibernate_seq")
	private Integer eno;
	@Column(name = "ename",length = 10)
	private String ename;
	@Column(name = "address",length =10)
	private String eadd;
	@Column(name = "salary")
	private Float esal;

}

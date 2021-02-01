package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		Employee entity = new Employee();
		// copy properties
		BeanUtils.copyProperties(dto, entity);
		return empRepo.save(entity).getEno();
	}

	/*
	 * @Override public int[] registerGroupOfEmp(List<EmployeeDTO> lidtDTO) {
	 * List<Employee> listEntity = new ArrayList(); // converting listDTO to
	 * lidtDTO.forEach(dto -> { Employee entity = new Employee(); // copy
	 * BeanUtils.copyProperties(dto, entity); listEntity.add(entity); }); // use
	 * repo List<Employee> listEnList1 = (List<Employee>)
	 * empRepo.saveAll(listEntity); // gather int[] ids = new
	 * int[listEnList1.size()]; // fetching results all for (int i = 1; i <
	 * listEnList1.size(); ++i) { ids[i] = listEnList1.get(i).getEno(); } return
	 * ids; }
	 */

	/*
	 * @Override public long getEmployeeCount() { // use repo return
	 * empRepo.count(); }
	 */
	/*
	 * @Override public String deleteEmpById(int id) {
	 * 
	 * if (empRepo.existsById(id)) { empRepo.deleteById(id); return id +
	 * "deleted from table"; } else { return id + " not deleted "; }
	 * 
	 * }
	 * 
	 * @Override public Optional<EmployeeDTO> getEmpById(int id) { //use repo
	 * Optional<Employee> opt=empRepo.findById(id); Optional
	 * optDTO=Optional.empty(); if(opt.isPresent()) { //get entity Employee
	 * entity=opt.get(); //copy properties EmployeeDTO dto=new EmployeeDTO();
	 * BeanUtils.copyProperties(entity, dto); optDTO=Optional.of(dto); } return
	 * optDTO; }
	 * 
	 * @Override public String removeEmpById(int id) { //use repo Optional<Employee>
	 * opt=empRepo.findById(id); if(opt.isPresent()) { empRepo.delete(opt.get());
	 * return id+"is deleted"; } else return id+ "is not found"; }
	 * 
	 * @Override public Iterable<EmployeeDTO> getAllEmp() {
	 * 
	 * //use repo Iterable<Employee> itEntity=empRepo.findAll();
	 * Iterable<EmployeeDTO> itDTO=new ArrayList(); itEntity.forEach(entity->{
	 * EmployeeDTO dto=new EmployeeDTO(); //copy properties
	 * BeanUtils.copyProperties(entity, dto); ((List<EmployeeDTO>) itDTO).add(dto);
	 * 
	 * }); return itDTO; }
	 * 
	 * @Override public String removeEmpByEntities(List<EmployeeDTO> listDTO) {
	 * List<Employee>listEntity=new ArrayList(); listDTO.forEach(dto->{ Employee
	 * entity=new Employee(); //copy properties BeanUtils.copyProperties(dto,
	 * entity); listEntity.add(entity); }); //use empRepo
	 * empRepo.deleteAll(listEntity);
	 * 
	 * return "multiple record is deleted"; }
	 * 
	 * @Override public List<EmployeeDTO> getEmpById(List<Integer> ids) { //use repo
	 * List<Employee> listEntity= (List<Employee>)empRepo.findAllById(ids);
	 * List<EmployeeDTO> listDTO=new ArrayList(); listEntity.forEach(entity->{
	 * EmployeeDTO dto=new EmployeeDTO(); //copy properties
	 * BeanUtils.copyProperties(entity, dto); listDTO.add(dto); });
	 * 
	 * return listDTO; }
	 * 
	 */

}

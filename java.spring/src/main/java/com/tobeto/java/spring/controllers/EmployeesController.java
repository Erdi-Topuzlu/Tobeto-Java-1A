package com.tobeto.java.spring.controllers;

import com.tobeto.java.spring.entities.Employee;
import com.tobeto.java.spring.services.abstracts.EmployeeService;
import com.tobeto.java.spring.services.dtos.requests.employee.AddEmployeeRequest;
import com.tobeto.java.spring.services.dtos.requests.employee.UpdateEmployeeRequest;
import com.tobeto.java.spring.services.dtos.responses.customer.GetListCustomerResponse;
import com.tobeto.java.spring.services.dtos.responses.employee.GetListEmployeeResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeesController {

    private EmployeeService employeeService;

    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public void add(@RequestBody AddEmployeeRequest request){
        employeeService.add(request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        employeeService.delete(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody UpdateEmployeeRequest request){
        employeeService.update(id, request);
    }

    @GetMapping
    public List<Employee> getByLastName(@RequestParam String lastName){
        return employeeService.getByLastName(lastName);
    }

    @GetMapping("dto")
    public List<GetListEmployeeResponse> getByLastNameAndPosition(@RequestParam String lastName, String position){
        return employeeService.getByLastNameAndPositionDto(lastName, position);
    }



    /*

    private final EmployeeRepository employeeRepository;

    public EmployeesController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> getAll(){
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @GetMapping("{id}")
    public Employee getById(@PathVariable int id){
        return employeeRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Employee employeeToDelete = employeeRepository.findById(id).orElseThrow();
        employeeRepository.delete(employeeToDelete);
    }

    @PutMapping("{id}")
    public void updateEmployee(@PathVariable int id,@RequestBody Employee updatedEmployee) {
        Employee employeeToUpdate = employeeRepository.findById(id).orElseThrow();
        employeeToUpdate.setFirstName(updatedEmployee.getFirstName());
        employeeToUpdate.setLastName(updatedEmployee.getLastName());
        employeeToUpdate.setPosition(updatedEmployee.getPosition());
        employeeToUpdate.setEMail(updatedEmployee.getEMail());
        employeeToUpdate.setPhoneNumber(updatedEmployee.getPhoneNumber());

        Employee employee1 = employeeRepository.save(employeeToUpdate);
    }
*/
}

package com.tobeto.java.spring.controllers;

import com.tobeto.java.spring.entities.Customer;
import com.tobeto.java.spring.services.abstracts.CustomerService;
import com.tobeto.java.spring.services.dtos.requests.customer.AddCustomerRequest;
import com.tobeto.java.spring.services.dtos.requests.customer.UpdateCustomerRequest;
import com.tobeto.java.spring.services.dtos.responses.customer.GetListCustomerResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/customers")
public class CustomerController {
    //Bağımlılıklar Daima Soyut Classlar üzerinden
    private CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void add(@RequestBody AddCustomerRequest request){
        customerService.add(request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        customerService.delete(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody UpdateCustomerRequest request){
        customerService.update(id, request);
    }

    @GetMapping
    public List<Customer> getByName(@RequestParam String name){
        return customerService.getByFirstname(name);
    }

    @GetMapping("dto")
    public List<GetListCustomerResponse> getByNameDto(@RequestParam String name){
        return customerService.getByFirstNameDto(name);
    }

    /*private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> getAll(){
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable int id){
        return customerRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Customer customer){
        customerRepository.save(customer);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        Customer customerToDelete = customerRepository.findById(id).orElseThrow();
        customerRepository.delete(customerToDelete);
    }

    @PutMapping("{id}")
    public void updateCustomer(@PathVariable int id,@RequestBody Customer updatedCustomer) {
        Customer customerToUpdate = customerRepository.findById(id).orElseThrow();
        customerToUpdate.setFirstName(updatedCustomer.getFirstName());
        customerToUpdate.setLastName(updatedCustomer.getLastName());
        customerToUpdate.setEMail(updatedCustomer.getEMail());
        customerToUpdate.setPhoneNumber(updatedCustomer.getPhoneNumber());
        customerToUpdate.setAddress(updatedCustomer.getAddress());

        Customer customer1 = customerRepository.save(customerToUpdate);
    }*/


}

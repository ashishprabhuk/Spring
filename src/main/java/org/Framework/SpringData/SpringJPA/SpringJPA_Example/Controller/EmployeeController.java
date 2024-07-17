package org.Framework.SpringData.SpringJPA.SpringJPA_Example.Controller;

import org.Framework.SpringData.SpringJPA.SpringJPA_Example.Employee;
import org.Framework.SpringData.SpringJPA.SpringJPA_Example.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @PostMapping("/addMultiple")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
        return service.saveEmployees(employees);
    }

    @GetMapping
    public List<Employee> findAllEmployees() {
        return service.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @GetMapping("/name/{name}")
    public List<Employee> findEmployeesByName(@PathVariable String name) {
        return service.getEmployeesByName(name);
    }

    @GetMapping("/role/{role}")
    public List<Employee> findEmployeesByRole(@PathVariable String role) {
        return service.getEmployeesByRole(role);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return service.deleteEmployee(id);
    }
}

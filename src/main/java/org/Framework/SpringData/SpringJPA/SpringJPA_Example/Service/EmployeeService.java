package org.Framework.SpringData.SpringJPA.SpringJPA_Example.Service;

import org.Framework.SpringData.SpringJPA.SpringJPA_Example.Employee;
import org.Framework.SpringData.SpringJPA.SpringJPA_Example.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees) {
        return repo.saveAll(employees);
    }

    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Employee> getEmployeesByName(String name) {
        return repo.findByName(name);
    }

    public List<Employee> getEmployeesByRole(String role) {
        return repo.findByRole(role);
    }

    public String deleteEmployee(Long id) {
        repo.deleteById(id);
        return "Employee removed !! " + id;
    }

    public Employee updateEmployee(Employee employee) {
        Optional<Employee> existingEmployee = repo.findById(employee.getId());
        if (existingEmployee.isPresent()) {
            Employee existing = existingEmployee.get();
            existing.setName(employee.getName());
            existing.setAge(employee.getAge());
            existing.setEmail(employee.getEmail());
            existing.setRole(employee.getRole());
            return repo.save(existing);
        } else {
            return null;
        }
    }
}


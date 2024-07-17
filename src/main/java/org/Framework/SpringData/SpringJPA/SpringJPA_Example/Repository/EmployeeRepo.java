package org.Framework.SpringData.SpringJPA.SpringJPA_Example.Repository;

import org.Framework.SpringData.SpringJPA.SpringJPA_Example.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);
    List<Employee> findByRole(String role);
}
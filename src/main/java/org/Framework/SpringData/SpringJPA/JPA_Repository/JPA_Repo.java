package org.Framework.SpringData.SpringJPA.JPA_Repository;

import org.Framework.SpringData.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JPA_Repo extends JpaRepository<Employee, Long> {
    // Custom query methods can be defined
    List<Employee> findByName(String name);
    List<Employee> findByRole(String role);

}

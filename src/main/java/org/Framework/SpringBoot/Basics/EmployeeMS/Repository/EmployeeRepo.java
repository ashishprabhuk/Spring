package org.Framework.SpringBoot.Basics.EmployeeMS.Repository;

import org.Framework.SpringBoot.Basics.EmployeeMS.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}

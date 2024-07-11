package org.Framework.SpringData.SpringJPA.EntityManager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.Framework.SpringData.Employee;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class EM_JPA_Repo {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Employee employee){
        entityManager.merge(employee);
    }

    public Employee findById(Long id){
        return entityManager.find(Employee.class, id);
    }

    public void deleteById(Long id){
        Employee emp = entityManager.find(Employee.class, id);
        entityManager.remove(emp);
    }
}

package org.Framework.SpringData.SpringJDBC;

import org.Framework.SpringData.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class JDBC_Emp_Controller {

    @Autowired
    private JDBC_Repo repo;

    @PostMapping
    public void addEmployee(@RequestBody Employee employee) {
        repo.insert(employee);
    }

    @DeleteMapping("/{id}")
    public void insertEmployee(@PathVariable long id){
        repo.deleteById(id);
    }

    @GetMapping("/{id}")
    public void getEmployee(@PathVariable long id){
        repo.findById(id);
    }
}

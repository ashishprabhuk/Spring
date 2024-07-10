package org.Framework.SpringData.SpringJDBC;

import org.Framework.SpringData.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JDBC_Employee_CLR implements CommandLineRunner {

    @Autowired
    private JDBC_Repo repo;

    @Override
    public void run(String... args) throws Exception {
        repo.insert(new Employee(1, "Ashish", 21, "ashihs@gmail.com", "Developer"));
        repo.insert(new Employee(2, "Yazhini", 15, "yaz@gmail.com", "Student"));
        repo.insert(new Employee(3, "apk", 21, "apk@gmail.com", "Manager"));

        repo.deleteByID(3);

        System.out.println(repo.findByID(1));
        System.out.println(repo.findByID(2));
    }
}

package org.Framework.SpringData;

import org.Framework.SpringData.SpringJPA.EntityManager.EM_JPA_Repo;
import org.Framework.SpringData.SpringJPA.JPA_Repository.JPA_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Employee_CLR implements CommandLineRunner {

//    @Autowired
//    private JDBC_Repo repo;

//    @Autowired
//    private EM_JPA_Repo repo;

    @Autowired
    private JPA_Repo repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Employee(1, "Ashish", 21, "ashihs@gmail.com", "Developer"));
        repo.save(new Employee(2, "Yazhini", 15, "yaz@gmail.com", "Student"));
        repo.save(new Employee(3, "apk", 21, "apk@gmail.com", "Manager"));
        repo.save(new Employee(4, "TCS", 21, "tcs@gmail.com", "SDE"));

        repo.deleteById(3l);

        System.out.println(repo.findById(1l));
        System.out.println(repo.findById(2l));
        System.out.println(repo.findById(4l));

        System.out.println(repo.findByName("Ashish"));
        System.out.println(repo.findByRole("Student"));
    }
}

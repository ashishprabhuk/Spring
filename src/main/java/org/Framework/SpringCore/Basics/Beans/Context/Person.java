package org.Framework.SpringCore.Basics.Beans.Context;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Identity(String job, int salary, Address address) {}
record Address(String city, String State) {}

@Configuration
public class Person {
    @Bean
    public String personName(){
        return "Ashish";
    }

    @Bean
    public int personAge(){
        return 21;
    }

    @Bean
    public String personJob(){
        return "SDE";
    }

    @Bean
    public int personSalary(){
        return 25000;
    }

    /*-------------------------------------------------------------------*/

    @Bean
    @Primary
    public Address address1(){
        return new Address("Trichy", "TamilNadu");
    }

    @Bean(name="workLocation") //we can change the name of the Bean (Custom Bean Name)
    @Qualifier("work_Address")
    public Address address2(){
        return new Address("Chennai", "TamilNadu");
    }

    @Bean
    public Address address3(){
        return new Address("Madurai", "TamilNadu");
    }

    /*-------------------------------------------------------------------*/

    @Bean
    @Primary
    public Identity identity1(){
        return new Identity("Dev", 50000, new Address("NYC", "USA"));
    }

    @Bean
    public Identity identity2(){
        return new Identity(personJob(), personSalary(), address1()); //calling bean methods
    }

    @Bean
    public Identity identity3(String personJob, int personSalary, Address address){ //parameterized Bean calling
        // Address address-> in here, it will take the @Primary bean.
        return new Identity(personJob, personSalary, address);
    }

    @Bean
    public Identity identity4(String personJob, int personSalary, @Qualifier("work_Address") Address address){ //parameterized Bean calling
        // @Qualifier("work_Address") Address address -> in here, it will override the @Primary bean to the qualified bean.
        return new Identity(personJob, personSalary, address);
    }
}

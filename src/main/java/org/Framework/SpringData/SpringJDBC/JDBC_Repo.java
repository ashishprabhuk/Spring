package org.Framework.SpringData.SpringJDBC;

import org.Framework.SpringData.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBC_Repo {

    @Autowired
    private JdbcTemplate jdbc;

    public static String INSERT_QUERY =
            """
                            INSERT INTO EMPLOYEE(id, name, age, email, role)
                            VALUES (?, ?, ? ,? ,?);
                    """;

    public static String DELETE_QUERY =
            """
                    DELETE FROM EMPLOYEE WHERE id=?
                    """;

    public static String SELECT_QUERY =
            """
                    SELECT * FROM EMPLOYEE WHERE id=?
                    """;

    public void insert(Employee employee) {
        jdbc.update(INSERT_QUERY, employee.getId(), employee.getName(), employee.getAge(), employee.getEmail(), employee.getRole());
    }

    public void deleteByID(long id){
        jdbc.update(DELETE_QUERY, id);
    }

    public Employee findByID(long id){
        return jdbc.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Employee.class), id);
    }
}

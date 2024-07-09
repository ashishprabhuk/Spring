package org.Framework.SpringBoot.Basics.ConfigProps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DatabaseConfig databaseConfig;

    @RequestMapping("/database")
    public DatabaseConfig getDataFromDB(){
        return databaseConfig;
    }

}

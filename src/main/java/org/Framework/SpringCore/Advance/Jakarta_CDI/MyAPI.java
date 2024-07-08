package org.Framework.SpringCore.Advance.Jakarta_CDI;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component // -> Spring
@Named // -> Jakarta CDI
public class MyAPI {
    private DataBase dataBase;

//    @Autowired // -> Spring
    @Inject // -> Jakarta CDI
    public MyAPI(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String getData() {
        return dataBase.retrieveData();
    }
}

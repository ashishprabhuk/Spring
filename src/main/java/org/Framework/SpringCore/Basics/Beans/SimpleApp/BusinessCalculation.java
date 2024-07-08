package org.Framework.SpringCore.Basics.Beans.SimpleApp;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculation {
    private DataService dataService;

    public BusinessCalculation(DataService dataService){
        super();
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}


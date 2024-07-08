package org.Framework.SpringCore.Basics.Beans.Autowired;

public class Engine {
    private String model;

    public Engine(String model){
        this.model=model;
    }

    public String getModel(){
        return model;
    }
}

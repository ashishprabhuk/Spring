package org.Framework.SpringCore.Basics.Beans.Autowired;

public class Tire {
    private String tire;

    public Tire(String tire){
        this.tire = tire;
    }

    public String getType(){
        return tire;
    }
}

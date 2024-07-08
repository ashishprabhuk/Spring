package org.Framework.SpringCore.Basics.Beans.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TireFitting {
    private Tire tire;

    @Autowired
    public TireFitting(Tire tire) {
        this.tire = tire;
    }

    public void fitTire() {
        System.out.println("Fitting tire: " + tire.getType());
    }
}
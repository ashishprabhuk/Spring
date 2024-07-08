package org.Framework.SpringCore.Basics.Beans.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarAssembly {
    private EngineAssembly engineAssembly;
    private TireFitting tireFitting;

    @Autowired
    public CarAssembly(EngineAssembly engineAssembly, TireFitting tireFitting) {
        this.engineAssembly = engineAssembly;
        this.tireFitting = tireFitting;
    }

    public void assembleCar() {
        System.out.println("Starting car assembly...");
        tireFitting.fitTire();
        engineAssembly.assembleEngine();
        System.out.println("Car assembly completed!");
    }
}

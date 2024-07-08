package org.Framework.SpringCore.Basics.Beans.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EngineAssembly {
    private Engine engine;

    @Autowired
    public EngineAssembly(Engine engine) {
        this.engine = engine;
    }
//        public EngineAssembly(@Qualifier("engine_suv")Engine engine) {
//            this.engine = engine;
//        }

    public void assembleEngine() {
        System.out.println("Assembling engine: " + engine.getModel());
    }
}



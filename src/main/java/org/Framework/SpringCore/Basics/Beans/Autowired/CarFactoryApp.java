package org.Framework.SpringCore.Basics.Beans.Autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarFactoryApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(CarFactoryConfig.class);

        CarAssembly carAssembly = context.getBean(CarAssembly.class);
        carAssembly.assembleCar();

        context.close();
    }
}


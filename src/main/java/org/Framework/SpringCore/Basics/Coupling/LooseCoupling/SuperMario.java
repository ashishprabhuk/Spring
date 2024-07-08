package org.Framework.SpringCore.Basics.Coupling.LooseCoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperMario implements Console{
    public void up(){
        System.out.println("JUMP");
    }
    public void down(){
        System.out.println("Going into the hole");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Accelerate");
    }
}

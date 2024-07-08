package org.Framework.SpringCore.Basics.Coupling.LooseCoupling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContra")
public class SuperContra implements Console{
    public void up() {
        System.out.println("Tackle");
    }
    public void down() {
        System.out.println("Sit Down");
    }
    public void left() {
        System.out.println("Defend");
    }
    public void right() {
        System.out.println("Shoot");
    }
}

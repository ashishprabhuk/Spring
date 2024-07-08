package org.Framework.SpringCore.Advance.Stereotype;

import org.springframework.stereotype.Component;

@Component
class MyComponent {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}
package org.Framework.SpringCore.Advance.Stereotype;

import org.springframework.stereotype.Service;

@Service
class MyService {
    public void performService() {
        System.out.println("Performing service...");
    }
}
package org.Framework.SpringCore.Basics.Beans.SimpleApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDB implements DataService{
    @Override
    public int[] retrieveData(){
        return new int[]{11, 22, 33, 44, 55};
    }
}

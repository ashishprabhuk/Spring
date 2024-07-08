package org.Framework.SpringCore.Advance.Stereotype;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
class MyRepository {
    private List<String> data = new ArrayList<>();

    public void save(String item) {
        data.add(item);
    }

    public List<String> findAll() {
        return data;
    }
}

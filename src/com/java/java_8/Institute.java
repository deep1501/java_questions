package com.java.java_8;

import java.util.List;

public class Institute {
    private String name;
    private List<String> locations;

    public Institute(String name, List<String> locations) {
        this.name = name;
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public List<String> getLocations() {
        return locations;
    }
}

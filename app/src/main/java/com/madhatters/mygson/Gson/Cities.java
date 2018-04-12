package com.madhatters.mygson.Gson;

import java.io.Serializable;
import java.util.List;

/**
 * Created by adil on 4/12/18.
 */

public class Cities implements Serializable {
    private String id;
    private String name;
    private List<Double>location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }
}

package com.madhatters.mygson.Gson;

import java.io.Serializable;

/**
 * Created by adil on 4/12/18.
 */

public class Vehicles implements Serializable {
    private String id;
    private String name;
    private String service;

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

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}

package com.madhatters.mygson.Gson;

import java.io.Serializable;
import java.util.List;

/**
 * Created by adil on 4/12/18.
 */

public class Catagerious implements Serializable {
    private String id;
    private String name;
    private int commission;
    private List<Double>vehicles;

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

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public List<Double> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Double> vehicles) {
        this.vehicles = vehicles;
    }
}

package com.madhatters.mygson.Gson;

import java.io.Serializable;
import java.util.List;

/**
 * Created by adil on 4/12/18.
 */

public class DataMoudle implements Serializable {
    private String bank;
    private List<Cities>cities;
    private List<Catagerious>catagerious;
    private List<Vehicles>vehicles;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public List<Cities> getCities() {
        return cities;
    }

    public void setCities(List<Cities> cities) {
        this.cities = cities;
    }

    public List<Catagerious> getCatagerious() {
        return catagerious;
    }

    public void setCatagerious(List<Catagerious> catagerious) {
        this.catagerious = catagerious;
    }

    public List<Vehicles> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicles> vehicles) {
        this.vehicles = vehicles;
    }
}

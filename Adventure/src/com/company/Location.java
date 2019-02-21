package com.company;

//based on the original colossal cave adventure game
//Personally, never heard of it

import java.util.HashMap;
import java.util.Map;

public class Location {
    //there are errors for these three private final
    //fields. Remember, they only go away when initialized by
    //a constructor.
    //Remember also, that final entails that the value
    //can only be assigned once and then cannot be changed
    //hence the variable value is FINAL
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    public Location(int locationID, String description) {
        this.locationID = locationID; //remember, this is final
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    //we're seeing a getter for Map for the very first time
    //notice how Map comes with <String, Integer>
    //I'm assuming the full object must contain those
    //parameters to distinguish from other Maps.
    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}

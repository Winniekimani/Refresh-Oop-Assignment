package com.houses.Encapsulation;

public class HouseDetails {
    private int noOfBedrooms;
    private int noOfBathrooms;

    private String houseLocation;


    public HouseDetails(int bedrooms, int bathrooms, String location) {
        this.noOfBedrooms = bedrooms;
        this.noOfBathrooms = bathrooms;
        this.houseLocation = location;
    }

    public int getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public void setNoOfBedrooms(int noOfBedrooms) {
        this.noOfBedrooms = noOfBedrooms;
    }

    public int getNoOfBathrooms() {
        return noOfBathrooms;
    }

    public void setNoOfBathrooms(int noOfBathrooms) {
        this.noOfBathrooms = noOfBathrooms;
    }

    public String getHouseLocation() {
        return houseLocation;
    }

    public void setHouseLocation(String houseLocation) {
        this.houseLocation = houseLocation;
    }
}

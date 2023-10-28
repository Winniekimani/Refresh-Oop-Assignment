package com.houses.inheritance;

import com.houses.abstraction.House;

import com.houses.Encapsulation.HouseDetails;
import com.houses.interfaces.AddTenantI;
import com.houses.interfaces.DisplayHouseTypeI;
import com.houses.interfaces.RemoveTenantI;

public class Apartment extends House implements DisplayHouseTypeI,AddTenantI, RemoveTenantI {

    private HouseDetails houseDetails;
    private int floorNumber;

    public Apartment(HouseDetails houseDetails, int floorNumber) {
        this.houseDetails = houseDetails;
        this.floorNumber = floorNumber;
    }

    @Override
    public void displayHouseType() {

       System.out.println("This is an apartment and is located at" +houseDetails.getHouseLocation() + "with " + houseDetails.getNoOfBedrooms() + " bedrooms, " + houseDetails.getNoOfBathrooms()+ " bathrooms, located on floor " + floorNumber + ".");
    }

    @Override
    public void addTenant() {
        System.out.println("Tenant added to an apartment with the following  location=" +houseDetails.getHouseLocation());
    }

    @Override
    public void removeTenant() {
        System.out.println("Tenant removed from apartment which has "+houseDetails.getNoOfBedrooms() +"bedrooms and" +houseDetails.getNoOfBathrooms() +"bathrooms");
    }

    @Override
    public void rentHouse() {
        System.out.println("apartment rented out");

    }

}

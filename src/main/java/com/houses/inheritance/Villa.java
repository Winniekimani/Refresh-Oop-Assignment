package com.houses.inheritance;

import com.houses.Encapsulation.HouseDetails;
import com.houses.abstraction.House;
import com.houses.interfaces.AddTenantI;
import com.houses.interfaces.DisplayHouseTypeI;
import com.houses.interfaces.RemoveTenantI;
import com.houses.interfaces.RentHouseI;

public class Villa extends House implements DisplayHouseTypeI, AddTenantI, RemoveTenantI, RentHouseI {

    private HouseDetails houseDetails;
    private int gardenSize;

    public Villa(HouseDetails houseDetails, int gardenSize) {
        this.houseDetails = houseDetails;
        this.gardenSize = gardenSize;
    }

    @Override
    public void displayHouseType() {
        System.out.println("This is a Villa housetype and its  located at " +houseDetails.getHouseLocation() + "with " + houseDetails.getNoOfBedrooms() + " bedrooms, " + houseDetails.getNoOfBathrooms() + " bathrooms, and a garden size of " + gardenSize + " sq. ft.");
    }

    @Override
    public void addTenant() {
        System.out.println("Tenant added to villa which has "+houseDetails.getNoOfBedrooms() +"bedrooms with the following  location=" +houseDetails.getHouseLocation());
    }

    @Override
    public void removeTenant() {
        System.out.println("Tenant removed from villa located at "+houseDetails.getHouseLocation());

    }

    @Override
    public void rentHouse() {
        System.out.println("villa rented out");
    }
}

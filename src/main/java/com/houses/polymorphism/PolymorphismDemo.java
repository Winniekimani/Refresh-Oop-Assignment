package com.houses.polymorphism;

import com.houses.Encapsulation.HouseDetails;
import com.houses.abstraction.House;
import com.houses.inheritance.Apartment;
import com.houses.inheritance.Villa;
import com.houses.interfaces.AddTenantI;

public class PolymorphismDemo {
    public static void main(String[] args) {

        //polymorphism
       House villa= new Villa(new HouseDetails(4,3,"kikuyu"),500);

       House apartment = new Apartment(new HouseDetails(20,10,"westlands"),5);


       villa.addTenant();
       villa.displayHouseType();
       villa.rentHouse();


       apartment.removeTenant();
       apartment.addTenant();

        AddTenantI at = new Villa(new HouseDetails(1,1,"limuru"),5000);
        at.addTenant();
    }
}

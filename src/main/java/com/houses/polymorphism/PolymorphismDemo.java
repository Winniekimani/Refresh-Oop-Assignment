package com.houses.polymorphism;

import com.houses.Encapsulation.HouseDetails;
import com.houses.abstraction.House;
import com.houses.inheritance.Apartment;
import com.houses.inheritance.Villa;
import com.houses.interfaces.AddTenantI;
import com.houses.interfaces.RemoveTenantI;
import com.houses.interfaces.RentHouseI;

public class PolymorphismDemo {
    public static void main(String[] args) {

        // Using interfaces to interact with different house types
        // Adding tenant to Villa
        AddTenantI tenantInVilla = new Villa(new HouseDetails(1, 1, "Limuru"), 5000);
        tenantInVilla.addTenant();

        RemoveTenantI tenantInApartment = new Apartment(new HouseDetails(2, 2, "Nairobi"), 3);
        tenantInApartment.removeTenant();

        RentHouseI rentVilla = new Villa(new HouseDetails(3, 2, "Karen"), 1000);
        rentVilla.rentHouse();


        //polymorphism
        House villa2= new Villa(new HouseDetails(4,3,"kikuyu"),500);
        villa2.addTenant();
        villa2.displayHouseType();
        villa2.rentHouse();


        House apartment2= new Apartment(new HouseDetails(20,10,"westlands"),5);
        apartment2.removeTenant();
        apartment2.addTenant();
    }
}

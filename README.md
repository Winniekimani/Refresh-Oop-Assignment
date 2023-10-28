# Refresh-Oop-Assignment
### How i have achieved the design principles in my code
1.Single Responsiblity Principle states that  a class should do one thing and therefore it should have only
a single reason to change.

        -HouseDetails(encapsulation)class has the responsibility of encapsulating details about a house, such as the 
        number of bedrooms, bathrooms, and location.
2.The Open-Closed Principle requires that classes should be open for extension and closed to modification.

        -Abstract class House declares abstract methods for displaying house type, adding/removing tenants, and renting a house.
         then the Villa and Apartment classes extend the House class and provide specific implementations for these methods 
         without modifying the base House class.
3.The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.

        -Villa and Apartment are subclasses of House. They override the methods declared in the base class without 
        changing their behavior, allowing these objects to be substituted for a House object.
4.Interface Segragation Principle which states Clients should not be forced to implement a function they do no need.
        
        -in my code,Interfaces such as AddTenantI, RemoveTenantI, DisplayHouseTypeI, and RentHouseI provide specific sets of methods
        and i've separated them. 
        Classes Villa and Apartment implement only the interfaces that are relevant to them. For instance, Villa implements A
        ddTenantI, RemoveTenantI, DisplayHouseTypeI, and RentHouseI, providing a clear and specific interface for each house type.

5.Dependency Inversion Principle.It states that our classes should depend upon interfaces or abstract classes instead of 
concrete classes and functions.

        -in my code PolymorphismDemo class interacts with  interfaces (AddTenantI, RemoveTenantI, etc.), 
        providing a level of abstraction, enabling the use of different house types without relying on specific implementations (Villa, Apartment).
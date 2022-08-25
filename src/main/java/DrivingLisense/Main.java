package DrivingLisense;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // * Create new object which contains list of all drivers and their fields
        var DriversList = new Drivers();
        // * Initializing field with list of all drivers as ArrayList
        DriversList.allDrivers = new ArrayList<>();
        // * Initializing field with list names as ArrayList
        DriversList.names = new ArrayList<>();
        // * Entering 19 names of men and women for random setting for new objects of drivers
        DriversList.names.add("Bohdan");
        DriversList.names.add("Oleg");
        DriversList.names.add("Pasha");
        DriversList.names.add("Ilia");
        DriversList.names.add("Andriy");
        DriversList.names.add("Maria");
        DriversList.names.add("Dmytro");
        DriversList.names.add("Alex");
        DriversList.names.add("Liza");
        DriversList.names.add("Vika");
        DriversList.names.add("Arina");
        DriversList.names.add("Polina");
        DriversList.names.add("Sofia");
        DriversList.names.add("Vitaliy");
        DriversList.names.add("Mikhailo");
        DriversList.names.add("Roman");
        DriversList.names.add("Yevhen");
        DriversList.names.add("Max");
        DriversList.names.add("Boris");
        DriversList.names.add("Sergiy");
        // * Calling a method chain to create objects of drivers, setting them names, age, days without bills, checking their age for having passport
        // * Randomly decided whether they have a driver license or not
        DriversList.setDrivers();
        DriversList.setNames();
        DriversList.setAge();
        DriversList.isPassportExist();
        DriversList.isDriverLicenseExist();
        DriversList.setDaysWithoutBills();
        // * Output the list with all drivers
        System.out.println(DriversList.allDrivers);
        System.out.println("===========================================================================");
        // * Call the method what makes a list of allowed drivers and then output the list of allowed to drive a car drivers ONLY
        System.out.println(DriversList.toMakeListOfAllowedRivers());


        // * Get statistic of random number values(optional)
        /**
        int more = 0;
        int less = 0;
        for (int i = 0; i < DriversList.allDrivers.size(); i++) {
            if (DriversList.allDrivers.get(i).daysWithoutBills > 365) more++;
            else less++;
        }
        System.out.println("More: " + more + "\n" + "Less" + less);
        */

    }
}

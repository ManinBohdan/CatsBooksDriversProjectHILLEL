package Cats;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // * Creating an object of Cities entity with list of cities
        var cityList = new Cities();
        // * Entering some city to give the first registrations to the cats
        cityList.cities.add("Dnipro");
        cityList.cities.add("Odesa");
        cityList.cities.add("Kharkiv");
        cityList.cities.add("Kyiv");
        cityList.cities.add("Mykolaiv");
        cityList.cities.add("Kherson");
        // * Creating an object of Cat entity with list of cats
        var CatsList = new Cat();
        // * Initializing field cats as ArrayList<Cat>
        CatsList.cats = new ArrayList<Cat>();
        // * Adding new cats to this collection
        CatsList.cats.add(new Cat("Thomas","Zytomyr"));
        CatsList.cats.add(new Cat("Bob","Ternopil"));
        CatsList.cats.add(new Cat("Edward","Kryvyi Rig"));
        CatsList.cats.add(new Cat("Lucas","Frankivsk"));
        CatsList.cats.add(new Cat("Aaron","Lviv"));
        CatsList.cats.add(new Cat("Nikolas","Mariupol"));
        // * Outputting the list of cats before changing their registration addresses
        System.out.println(CatsList.cats);
        // * Call the method that change registration for our cats
        CatsList.cats = CatsList.registrationChanges(cityList.cities);
        // * Outputting the list of cats after changing their registration addresses
        System.out.println(CatsList.cats);


    }


}

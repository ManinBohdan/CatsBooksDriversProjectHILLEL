package Cats;

import java.util.List;
import java.util.Random;

public class Cat implements RegistrationOfCatChangeable {
    // * Creating an empty constructor for creating an object with list of cats
    public Cat(){}
    // * Creating constructor for new cats
    public Cat (String name, String registration) {
        this.name = name;
        this.registration = registration;
    }
    // * Creating fields
    public List<Cat> cats;
    public String registration;
    public String name;
    // * Method that change registration address of cats to another random one by randomly choosing it from list of cities
    @Override
    public List<Cat> registrationChanges( List<String> cities) {
        var random = new Random();
        for (int i = 0; i < cats.size(); i++) {
            cats.get(i).registration = cities.get(random.nextInt(cities.size()));
        }
        return cats;
    }
    // * Overrided method toString that help to output text and values we want to
    @Override
    public String toString(){
        return "Name: " + name + ", Registration: " + registration + "\n";

    }
}

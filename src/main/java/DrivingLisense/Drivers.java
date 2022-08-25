package DrivingLisense;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Drivers implements toMakeListOfAllowedRiversInterface{
    // * Default constructor for creating a list with datatype of Drivers
    public Drivers() {
    }
    // * Constructor with arguments for creating an objects of drivers
    public Drivers(Boolean driverLisense, Integer age, Integer daysWithoutBills) {
        this.driverLisense = driverLisense;
        this.age = age;
        this.daysWithoutBills = daysWithoutBills;
    }
    // * Fields
    public String name;
    public Boolean driverLisense;
    public Boolean passport;
    public Integer age;
    public Integer daysWithoutBills;
    public Integer amountOfDrivers = 120;
    public List<Drivers> allDrivers;
    public List<Drivers> allowedDrivers;
    public List<String> names;

    // * Method that create a new driver and add him to the collection as many times as field of amountOfDrivers is
    public List<Drivers> setDrivers () {
        for (int i = 0; i < amountOfDrivers; i++) {
            allDrivers.add(new Drivers());
        }
        return allDrivers;
    }
    // * Method that set a name randomly from list of names to each driver in list of drivers
    public void setNames () {
        var RANDOM = new Random();
        for (int i = 0; i < allDrivers.size(); i++) {
            allDrivers.get(i).name = names.get(RANDOM.nextInt(names.size()));
        }
    }
    // * Method that set age randomly to each driver in list of drivers, but minimal age is 10 y.o.
    public void setAge () {;
        for (int i = 0; i < allDrivers.size(); i++) {
            allDrivers.get(i).age = Math.toIntExact(Math.round(Math.random() * 75 + 10));
        }
    }
    // * Method that check age of driver and set the field of passport with value true or false
    public void isPassportExist () {
        for (int i = 0; i < allDrivers.size(); i++) {
            if (allDrivers.get(i).age > 16){
            allDrivers.get(i).passport = Boolean.TRUE;
            }
            else {allDrivers.get(i).passport = Boolean.FALSE;}
        }
    }
    // * Method that check age and passport of driver and by Random method set field of driver license as true or false
    public void isDriverLicenseExist (){
        for (int i = 0; i < allDrivers.size(); i++) {
            if (allDrivers.get(i).passport == Boolean.TRUE && allDrivers.get(i).age > 18){
                if (new Random().nextInt(11) % 2 == 0){
                    allDrivers.get(i).driverLisense = Boolean.TRUE;
                }
                else {allDrivers.get(i).driverLisense = Boolean.FALSE;}
            }
           /** Possibility to add some logic for case of drivers of this age
            ** else if (age > 16 && age < 18){}
            */
            else {allDrivers.get(i).driverLisense = Boolean.FALSE; }
        }
    }
    // * Method that randomly set amount of days without bills, but max value is up to 700
    public void setDaysWithoutBills () {
        for (int i = 0; i < allDrivers.size(); i++) {
            allDrivers.get(i).daysWithoutBills = new Random().nextInt(700);
        }
    }
    // * Overrided method of toString for beautifully outputting
    @Override
    public String toString () {
        return "Name: " + name + ", Age: " + age + ", Passport: " + passport + ", Days Without Bills: " + daysWithoutBills + ", Driver License: " + driverLisense + "\n";
    }
    // * Implemented method that check all needed fields and makes new list of drivers allowed to drive a car
    @Override
    public List<Drivers> toMakeListOfAllowedRivers() {
        allowedDrivers = new ArrayList<Drivers>();
        for (int i = 0; i < allDrivers.size(); i++) {
            if (allDrivers.get(i).passport == Boolean.TRUE && allDrivers.get(i).driverLisense == Boolean.TRUE && allDrivers.get(i).daysWithoutBills >=365 ){
                allowedDrivers.add(allDrivers.get(i));
            }
        }
        return allowedDrivers;
    }
}

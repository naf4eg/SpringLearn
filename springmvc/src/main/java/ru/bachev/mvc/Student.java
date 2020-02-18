package ru.bachev.mvc;

import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;

    private HashMap<String, String> countryList;

    public HashMap<String, String> getCountryList() {
        return countryList;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student() {
        countryList = new HashMap<>();
        countryList.put("BR", "Brazil");
        countryList.put("GER", "Germany");
        countryList.put("RU", "Russia");
        countryList.put("IN", "India");
        countryList.put("US","United State of America");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

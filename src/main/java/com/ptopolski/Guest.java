package com.ptopolski;

import java.util.Date;

public class Guest {
    private String firstName;
    private String surname;
    private String birthDate;

    public Guest() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Guest {" +
                " First Name = '" + firstName + '\'' +
                ", Surname = '" + surname + '\'' +
                ", Birth Date = " + birthDate +
                '}';
    }
}

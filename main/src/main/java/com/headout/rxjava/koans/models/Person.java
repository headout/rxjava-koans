package com.headout.rxjava.koans.models;

import javax.validation.constraints.NotNull;

/**
 * Created by madki on 10/12/16.
 */
public class Person {
    private final String firstName;
    private final String lastName;

    public static Person create(@NotNull String firstName, @NotNull String lastName) {
        return new Person(firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (!getFirstName().equals(person.getFirstName())) return false;
        return getLastName().equals(person.getLastName());
    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    private Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}

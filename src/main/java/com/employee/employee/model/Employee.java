package com.employee.employee.model;

import java.util.Objects;

public class Employee {


    private final String lastName;
    private final String firstName;


    public Employee(String lastName,
                    String firstName
                    ) {

        this.lastName = lastName;
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) {
            return true;
        }
        if (o==null || getClass() != o.getClass()) {
    return false;
        }
        Employee employee = (Employee) o;
return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }

    @Override
    public String toString() {
        return String.format(
                "ФИО: %s %s",
                lastName,
                firstName
                );
    }
}

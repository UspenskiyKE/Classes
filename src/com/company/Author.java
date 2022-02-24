package com.company;

import java.util.Objects;

public class Author {
    private final String id;
    private String firstName;
    private String lastName;

    public Author(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return (id.equals(c2.id) && firstName == c2.firstName && lastName == c2.lastName && this != null && c2 != null) || (this == c2 && this != null);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }


}

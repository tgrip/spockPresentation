package org.example;

public class PersonFactory {

    public static Person createDeveloper() {
        Person person = new Person();
        person.setAge(28);
        person.setJob("Developer");
        return person;
    }
}

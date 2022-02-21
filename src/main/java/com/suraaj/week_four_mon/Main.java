package com.suraaj.week_four_mon;

public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonFileDataAccessService();

        PersonService personService = new PersonService(personDAO);
        personService.savePerson(new Person(3, "John", 20));

        System.out.println(personService.getPeople());
    }
}
package com.suraaj.week_four_mon;

import java.util.List;

public interface PersonDAO {
    void savePerson(Person person);
    void deletePerson(int id);
    List<Person> getPeople();
    Person getPersonById(int id);
}
package com.suraaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController

public class SpringBootApplicationPeople {
    static List<Person> people = new ArrayList<Person>();
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationPeople.class, args);
        Person person1 = new Person(1,"John", 19);
        Person person2 = new Person(2, "Max", 21);
        Person person3 = new Person(3, "Louis", 24);
        people.add(person1);
        people.add(person2);
        people.add(person3);
    }

    @GetMapping("people/{id}")
    public Person getPersonById(@PathVariable("id") Integer id) {
        for (Person person : people) {
            if (person.getId()==id){
                return person;
            }
        }
        return null;
        // filter list and return person that matches id otherwise return null
    }

    @GetMapping("everyone")
    public List<Person> getAllPeople() {
        return people;
    }

    // create another method that returns all people using @GetMapping("people")

    static class Person{
        private int id;
        private String name;
        private Integer age;

        public Person(int id, String name, Integer age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public Person() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return id == person.id && Objects.equals(name, person.name) && Objects.equals(age, person.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id, age);
        }
    }
}


    // All your code should be inside this one class
    // add @RestController to you expose methods as REST services to clients
    // create a static List of type person with few people inside
    // create a class called Person with following properties: id, name, age
    // implement getPersonById
    /*
        @GetMapping("people/{id}")
        public Person getPersonById(@PathVariable("id") Integer id) {
            // filter list and return person that matches id otherwise return null
        }
     */
    // create another method that returns all people using @GetMapping("people")
    // test your api using chrome

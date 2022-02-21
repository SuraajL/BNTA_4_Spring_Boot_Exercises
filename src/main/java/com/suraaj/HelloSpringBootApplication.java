package com.suraaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

	//localhost:8080     <- this is the route path if you dont specify the path
	@GetMapping
	String greet(){
		return "Hello Suraaj";
	}

	@GetMapping(params = "name") //localhost:8080/?name=foo     <- change foo to whatever name you want
	//name here is an optional parameter which is why there is a '?'.
	String greetName(@RequestParam("name") String name){ //request param and store it into a string variable, name.
		return "Hello " + name + " how are you today?";
	}

	//localhost:8080/ping
	@GetMapping(path = "ping")
	String ping(){
		return "pong";
	}

	//localhost:8080/bar
	@GetMapping(path = "bar")
	String foo(){
		return "bar";
	}

	@GetMapping(path = "people")
	List<Person> getPerson(){
		return List.of(
				new Person("Alex",24),
				new Person("Wendy", 23));
	}

	@PostMapping(path = "people") //can have same path as above as its a different method
	void addPerson(Person person){
		System.out.println(person);
	}

	static class Person{
		private String name;
		private Integer age;

		public Person(String name, Integer age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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
					", age=" + age +
					'}';
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Person person = (Person) o;
			return Objects.equals(name, person.name) && Objects.equals(age, person.age);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, age);
		}
	}

}

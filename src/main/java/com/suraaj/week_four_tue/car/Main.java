package com.suraaj.week_four_tue.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        CarDAO carDAO = new FakeCarDataAccessService();
//        CarService carService = new CarService(carDAO);
//        CarController carController = new CarController(carService);
        //instead of doing above, we add components in the classes.
        // Use @component or specific (@service, @repository etc)
        SpringApplication.run(Main.class, args);
    }

//    @Bean("fake")
//    public CarDAO fakeDataAccessService() {
//        return new FakeCarDataAccessService();
//    }
}
package com.suraaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootApplicationCounter {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationCounter.class, args);
    }

    static int count = 0;

    @GetMapping(path = "current-count")
    int currentCurrent(){
        return count;
    }
    // Create method to increment the count. i.e localhost:8080/increment-count
    @GetMapping("increment-count")
    int incrementCurrent(){
        return ++count;
    }
    // Create method to decrement the count. i.e localhost:8080/decrement-count
    @GetMapping("decrement-count")
    int decrementCurrent(){
        return --count;
    }
}
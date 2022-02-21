package com.suraaj.week_four_tue.car;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fake") //@repository if class to access data data
public class FakeCarDataAccessService implements CarDAO {

    private List<Car> db;

    public FakeCarDataAccessService() {
        this.db = new ArrayList<>();
    }

    @Override
    public Car selectCarById(Integer id) {
        return null;
    }

    @Override
    public List<Car> selectAllCars() {
        return db;
    }

    @Override
    public int insertCar(Car car) {
        db.add(car);
        return 1;
    }

    @Override
    public int deleteCar(Integer id) {
        return 0;
    }

    @Override
    public int updateCar(Integer id, Car update) {
        return 0;
    }
}
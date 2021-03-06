package com.suraaj.week_four_tue.car;

import java.util.List;

public interface CarDAO {
    Car selectCarById(Integer id);
    List<Car> selectAllCars();
    int insertCar(Car car);
    int deleteCar(Integer id);
    int updateCar(Integer id, Car update);
}
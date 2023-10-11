package com.patika.business.abstracts;

import com.patika.business.request.AddCarRequest;
import com.patika.entities.Car;
import com.patika.utilities.results.DataResult;
import com.patika.utilities.results.Result;

public interface CarService {
    public DataResult<AddCarRequest> add(AddCarRequest addCarRequest);
    public Result delete(Car car);
    public DataResult<Car> update(Car car);
    public DataResult<Car> getAll(Car car);
    public DataResult<Car> getCarByUserId(Car car);
}

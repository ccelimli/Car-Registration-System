package com.patika.business.concretes;

import com.patika.business.abstracts.CarService;
import com.patika.business.request.AddCarRequest;
import com.patika.business.response.GetCarResponse;
import com.patika.dataAccess.CarRepository;
import com.patika.entities.Car;
import com.patika.utilities.mappers.ModelMapperManager;
import com.patika.utilities.mappers.ModelMapperService;
import com.patika.utilities.results.DataResult;
import com.patika.utilities.results.ErrorDataResult;
import com.patika.utilities.results.Result;
import com.patika.utilities.results.SuccessDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarManager implements CarService {

    CarRepository _carRepository;
    ModelMapperService _modelMapperService;


    @Autowired
    public CarManager(CarRepository carRepository, ModelMapperService modelMapperService){
        this._carRepository=carRepository;
        this._modelMapperService=modelMapperService;
    }

    @Override
    public DataResult<AddCarRequest> add(AddCarRequest addCarRequest) {
        try {
            Car car= this._modelMapperService.forRequest().map(addCarRequest,Car.class);
            this._carRepository.save(car);
            addCarRequest= this._modelMapperService.forResponse().map(car,AddCarRequest.class);
            return new SuccessDataResult<>(addCarRequest,"Success");
        }catch (Exception error){
            return new ErrorDataResult<>(error.getMessage());
        }
    }

    @Override
    public Result delete(Car car) {
        return null;
    }

    @Override
    public DataResult<Car> update(Car car) {
        return null;
    }

    @Override
    public DataResult<Car> getAll(Car car) {
        return null;
    }

    @Override
    public DataResult<Car> getCarByUserId(Car car) {
        return null;
    }
}

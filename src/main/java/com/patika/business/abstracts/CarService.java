package com.patika.business.abstracts;

import com.patika.business.request.AddCarRequest;
import com.patika.business.request.UpdateCarRequest;
import com.patika.business.response.GetCarResponse;
import com.patika.entities.Car;
import com.patika.utilities.results.DataResult;
import com.patika.utilities.results.Result;

import java.util.List;

public interface CarService {
     DataResult<AddCarRequest> add(AddCarRequest addCarRequest);
     Result delete(int id);
     DataResult<Car> update(UpdateCarRequest updateCarRequest);
     DataResult<List<GetCarResponse>> getAll();
     DataResult<List<GetCarResponse>> getCarByUserId(int id);
     DataResult<GetCarResponse> getCarById(int id);
}

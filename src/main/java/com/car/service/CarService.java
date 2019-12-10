package com.car.service;

import com.car.Dto.CarDto;
import com.car.util.CarDatabase;

public class CarService {

	public CarDto getCarByYear(int year) {
		return CarDatabase.carList.get(year);

	}

}

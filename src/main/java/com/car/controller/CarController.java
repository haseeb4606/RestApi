package com.car.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.car.Dto.CarDto;
import com.car.service.CarService;

@RestController
public class CarController {

	private CarService service;

	@RequestMapping(value = "get")
	public CarDto getCarByYear(@RequestParam Integer year) {

		return service.getCarByYear(year);

	}

	public CarService getService() {
		return service;
	}

	public void setService(CarService service) {
		this.service = service;
	}

}

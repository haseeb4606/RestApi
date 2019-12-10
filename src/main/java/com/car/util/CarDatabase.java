package com.car.util;

import java.util.HashMap;
import java.util.Map;

import com.car.Dto.CarDto;

public class CarDatabase {

	public static Map<Integer, CarDto> carList;

	static {
		carList = new HashMap<Integer, CarDto>();

		CarDto cr = new CarDto();

		cr.setMake("Honda");
		cr.setDescription("XLE");
		cr.setModel("Accord");
		cr.setYear(2020);

		carList.put(10, cr);

		CarDto cr1 = new CarDto();

		cr1.setMake("Toyota");
		cr1.setDescription("Limitid");
		cr1.setModel("Highlander");
		cr1.setYear(2019);

		carList.put(11, cr1);

		CarDto cr2 = new CarDto();

		cr2.setMake("Nissan");
		cr2.setDescription("Touring Black");
		cr2.setModel("Altima");
		cr2.setYear(2018);

		carList.put(12, cr1);

	}
}
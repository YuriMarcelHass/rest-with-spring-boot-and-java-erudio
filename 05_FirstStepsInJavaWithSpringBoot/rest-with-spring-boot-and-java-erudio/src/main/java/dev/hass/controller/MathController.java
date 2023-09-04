package dev.hass.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dev.hass.service.MathService;

@RestController
public class MathController {
	
	private MathService mathService = new MathService();
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {
		return mathService.sum(numberOne, numberTwo);
	}
	
	@GetMapping("/subtraction/{numberOne}/{numberTwo}")
	public Double subtraction(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		return mathService.subtraction(numberOne, numberTwo);
	}
	
	@GetMapping("/multiplication/{numberOne}/{numberTwo}")
	public Double multiplication(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		return mathService.multiplication(numberOne, numberTwo);
	}
	
	@GetMapping("/division/{numberOne}/{numberTwo}")
	public Double division(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		return mathService.division(numberOne, numberTwo);
	}
	
	@GetMapping("/average/{numberOne}/{numberTwo}")
	public Double average(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		return mathService.average(numberOne, numberTwo);
	}
	
	@GetMapping("/square_root/{number}")
	public Double squareRoot(
			@PathVariable(value = "number") String number
			) throws Exception {
		return mathService.squareRoot(number);
	}
}

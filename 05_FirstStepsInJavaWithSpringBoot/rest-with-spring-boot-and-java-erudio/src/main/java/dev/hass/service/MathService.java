package dev.hass.service;

import java.util.ArrayList;
import java.util.Arrays;

import dev.hass.converters.NumberConverter;
import dev.hass.exceptions.UnsupportedMathOperationException;

public class MathService {

	public Double sum(String numberOne, String numberTwo) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(numberOne, numberTwo)));
		
		return NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo);
	}
	
	public Double subtraction(String numberOne, String numberTwo) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(numberOne, numberTwo)));
		
		return NumberConverter.convertToDouble(numberOne) - NumberConverter.convertToDouble(numberTwo);
	}
	
	public Double multiplication(String numberOne, String numberTwo) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(numberOne, numberTwo)));
		
		return NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo);
	}
	
	public Double division(String numberOne, String numberTwo) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(numberOne, numberTwo)));
		
		return NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo);
	}
	
	public Double average(String numberOne, String numberTwo) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(numberOne, numberTwo)));
		
		return (NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo)) / 2;
	}
	
	public Double squareRoot(String number) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(number)));
		
		return Math.sqrt(NumberConverter.convertToDouble(number));
	}
	
	private void validateNumbers(ArrayList<String> numbers) throws UnsupportedMathOperationException {
		for (String number : numbers) {
			if (!NumberConverter.isNumeric(number)) {
				throw new UnsupportedMathOperationException("Please set a numeric value");
			}
		}
	}
}

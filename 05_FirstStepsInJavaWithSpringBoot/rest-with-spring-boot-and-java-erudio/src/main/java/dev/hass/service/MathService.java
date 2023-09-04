package dev.hass.service;

import java.util.ArrayList;
import java.util.Arrays;

import dev.hass.exceptions.UnsupportedMathOperationException;

public class MathService {

	public Double sum(String numberOne, String numberTwo) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(numberOne, numberTwo)));
		
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}
	
	public Double subtraction(String numberOne, String numberTwo) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(numberOne, numberTwo)));
		
		return convertToDouble(numberOne) - convertToDouble(numberTwo);
	}
	
	public Double multiplication(String numberOne, String numberTwo) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(numberOne, numberTwo)));
		
		return convertToDouble(numberOne) * convertToDouble(numberTwo);
	}
	
	public Double division(String numberOne, String numberTwo) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(numberOne, numberTwo)));
		
		return convertToDouble(numberOne) / convertToDouble(numberTwo);
	}
	
	public Double average(String numberOne, String numberTwo) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(numberOne, numberTwo)));
		
		return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
	}
	
	public Double squareRoot(String number) throws Exception {
		validateNumbers(new ArrayList<String>(Arrays.asList(number)));
		
		return Math.sqrt(convertToDouble(number));
	}
	
	private void validateNumbers(ArrayList<String> numbers) throws UnsupportedMathOperationException {
		for (String number : numbers) {
			if (!isNumeric(number)) {
				throw new UnsupportedMathOperationException("Please set a numeric value");
			}
		}
	}

	private boolean isNumeric(String strNumber) {
		if (strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

	private Double convertToDouble(String strNumber) {
		if (strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		
		return 0D;
	}
}

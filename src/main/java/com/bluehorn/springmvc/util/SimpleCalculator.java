package com.bluehorn.springmvc.util;

import java.math.BigDecimal;

public class SimpleCalculator implements Calculator {

	public SimpleCalculator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal add(BigDecimal number1, BigDecimal number2) {
		if(number1 != null) {
			return number1.add(number2);
		} else if(number2 != null) {
			return number2;
		}
		return null;
	}

	@Override
	public BigDecimal subtract(BigDecimal number1, BigDecimal number2) {

		if(number1 != null) {
			return number1.subtract(number2);
		} else if (number2 != null) {
			return number2;
		}
		return null;
	}

	@Override
	public BigDecimal multiply(BigDecimal number1, BigDecimal number2) {
		if(number1 != null && number2 != null) {
			return number1.multiply(number2);
		}
		return null;
	}

	@Override
	public BigDecimal divide(BigDecimal number1, BigDecimal number2) {
		if(number1 != null && number2 != null) {
			return number1.divide(number2);
		}
		return null;
	}

}

package com.bluehorn.springmvc.util;

import java.math.BigDecimal;

public interface Calculator {

	public BigDecimal add(BigDecimal number1, BigDecimal number2);
	
	public BigDecimal subtract(BigDecimal number1, BigDecimal number2);
	
	public BigDecimal multiply(BigDecimal number1, BigDecimal number2);
	
	public BigDecimal divide(BigDecimal number1, BigDecimal number2);
}

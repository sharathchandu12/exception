package com.epam.exception;

public class SimpleInterest {
	public double calculateSimpleInterest(double principalAmount,double timeInYears,double rateOfInterest)
	{
		return((principalAmount*timeInYears*rateOfInterest)/100);
	}
}

package com.java.assignmenteight.two;

@SuppressWarnings("serial")
public class NegativeAgeException extends Exception{
	public NegativeAgeException() {
		System.out.println("Inputs negative value for age.");
	}
	
	public String getMessage(){
		return " And age cann't be negative";
	}
}

package com.java.assignmenteight.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeClass {
	
	public static String age;
	public static BufferedReader br ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		ageValidation(Integer.parseInt(age));
	}

	private static void ageValidation(int parseInt) {
		// TODO Auto-generated method stub
		if (parseInt < 0) {
			try {
				throw new NegativeAgeException();
			} catch (NegativeAgeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} else {

		}
	}

	private static void input() {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			age = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

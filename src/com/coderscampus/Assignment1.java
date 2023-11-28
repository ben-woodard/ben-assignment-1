package com.coderscampus;

import java.util.*;

public class Assignment1 {
	
	String calcInterest () {		
		//Obtain information from user // 
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Type in your starting investment:");
		String initInvestment = scanner.nextLine();
		double convertedInvestment = Double.parseDouble(initInvestment);
		System.out.println("Type in your yearly interest rate:");
		String intRate = scanner.nextLine();
		double convertedIntRate = Double.parseDouble(intRate);		
	
		//iterate through interest rate formula 30 times with for loop,
		//print values in 5 year increments//
		
		double newValue = convertedInvestment * (convertedIntRate + 1.0);
		  for (int i = 1; i < 30; i = i++) { 
			newValue = newValue * (convertedIntRate + 1.0);  
			i++;
			if(i == 5) {
				int returnValue = (int)Math.round(newValue);
				System.out.println("After 5 years, you would have: " + returnValue);
			} else if (i == 10) {
				int returnValue = (int)Math.round(newValue);
				System.out.println("After 10 years, you would have: " + returnValue);
			} else if (i == 15) {
				int returnValue = (int)Math.round(newValue);
				System.out.println("After 15 years, you would have: " + returnValue);
			} else if (i == 20) {
				int returnValue = (int)Math.round(newValue);
				System.out.println("After 20 years, you would have: " + returnValue);
			} else if (i == 25) {
				int returnValue = (int)Math.round(newValue);
				System.out.println("After 25 years, you would have: " + returnValue);
			}
		  } 	
		  //return string at end of the loop(i = 30);//
		  
		    int returnValue = (int)Math.round(newValue);
		    return "After 30 years, you would have: " + returnValue;			
	  } 	


	public static void main(String[] args) {
		
		//create iteration of Assignment1 object and call .calcInterest method on the object;//
		
		Assignment1 newInvestment = new Assignment1();
        System.out.println(newInvestment.calcInterest());
	}

}

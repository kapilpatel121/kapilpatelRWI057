package com.rwi.interfaceExmple;

public class Customer {

	public static void main(String[] args) {
		Bank b=null; 
		
		b = new SBI();
		System.out.println("SBI ROI: " + b.rateOfInterest());
		System.out.println("----------------------------------------------------");
		
		b = new PNB();
		System.out.println("PNB ROI: " + b.rateOfInterest());
		System.out.println("----------------------------------------------------");
		
		
	}
}

package com.rwi.string;

public class str03 {
	 public static void main(String[] args){  
		   String s="Sachin";  
		   s.concat(" Tendulkar");
		   System.out.println(s);// strings are immutable objects  
	     s= s.concat(" Tendulkar");
	     System.out.println(s);
	 }  
	}
package com.nt.javv8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> p = i-> i%2==0;
		
		List<Integer> list=new ArrayList();
		list.add(10);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(15);
		list.add(26);
		list.add(35);
		list.add(19);
		
		     list.forEach(i->{
		    	 if(p.test(i)==true) {
		    		 System.out.println( i +"  is even");
		    	 }
		    	 else{
		    		 System.out.println( i +"  is odd");
		    	 }
		     });
		
	}
}

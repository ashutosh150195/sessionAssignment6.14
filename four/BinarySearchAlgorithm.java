package com.java.assignmentsix.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearchAlgorithm {
	
	public static void main(String args[]) throws IOException {
		String input ;
	    int first, last, middle, array[];
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter number of elements");
	    input = br.readLine(); 
	    array = new int[Integer.parseInt(input)];
	 
	    System.out.println("Elements are given below : ");
	 
	   for (int i = 0; i < array.length; i++) {
		System.out.println(array[i] = (i+1));
	}
	    System.out.println("Enter value to find");
	    input = br.readLine();
	 
	    first  = 0;
	    last   = array.length-1;
	    middle = (first + last)/2;
	 
	    while( first <= last )
	    {
	      if ( array[middle] < Integer.parseInt(input) )
	        first = middle + 1;    
	      else if ( array[middle] == Integer.parseInt(input) ) 
	      {
	        System.out.println(Integer.parseInt(input) + " found at location " + (middle + 1) + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if ( first > last )
	      System.out.println(Integer.parseInt(input) + " is not present in the list.\n");
	  }
}

package com.selectionsort;

public class ExampleSelectionSort {
	
	public static void main(String a[]){
        
	       int[] arr1 = {10,9,3,5,0,1,2,7,6,8,4};
	       
	       System.out.print("Before Sorting: ");
	       for(int x:arr1){
	            System.out.print(x + "  ");
	        }
	      
	       int[] arr2 = doSelectionSort(arr1);
	      
	        System.out.print("\nAfter Sorting: ");
	        for(int y :arr2){
	        	System.out.print(y + "  ");
	         }
	    }

	 public static int[] doSelectionSort(int[] input){
	         
	        for (int i = 0; i < input.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < input.length; j++)
	                if (input[j] < input[index]) 
	                    index = j;
	      
	            int smallerNumber = input[index];  
	            input[index] = input[i];
	            input[i] = smallerNumber;
	        }
	        return input;
	    }
}



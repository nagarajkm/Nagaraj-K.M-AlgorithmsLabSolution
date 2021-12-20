package com.greatlearning.lab;

import java.util.Scanner;

public class Transactions {
	
	
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of transcations");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter the transcarion values");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number of targets");
         int numtargets=sc.nextInt();
         
         for(int i=0;i<numtargets;i++) {
        	 
        	 System.out.println("Enter the targets");
        	 int target=sc.nextInt();
        	 
        	 int sum=0;
        	 for(int j=0;j<arr.length;j++) {
        		 sum=sum+arr[j];
        		 if(sum>=target) {
        			 System.out.println("Target is reached after "+(j+1)+" transaction");
        		      break;
        		 }
        		 if(j==arr.length-1 && sum<target) {
        			 System.out.println("Target is not acchieved");
        		 }
        		 
        	 }
        	 
        	 
        	 
         }
	}

}

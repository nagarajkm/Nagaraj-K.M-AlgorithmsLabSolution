package com.sorting;

import java.util.Scanner;

public class minimumNote {
	
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
               System.out.println("Enter the number of denomination");
               int size=sc.nextInt();
                int[] notes=new int[size];
                int []numnotes=new int [size];
               System.out.println("Enter the  denomination");

                for(int i=0;i<size;i++){
	                   notes[i]=sc.nextInt();
                  }
                
                MergeSortImplementation ms=new MergeSortImplementation();
                ms.sort(notes,0,notes.length-1);
                
                for(int j=0;j<notes.length;j++) {
                	
                	System.out.println(notes[j]);
                	
                }
                
                System.out.println("what is the amount to pay");
                int amount=sc.nextInt();
                
                for(int i=0;i<notes.length;i++) {
                	int n=(int) (amount/notes[i]);
                	// System.out.println(notes[i]+" : "+n);
                	numnotes[i]=n;
                	 
                	 amount=amount-(n*notes[i]);
                	 
                	 if(i==notes.length-1 && amount!=0) {
                		 System.out.println("not possible to pay the amount");
                	 }
                	 else if(i==notes.length-1 && amount==0) {
                		 
                		 for(int j=0;j<numnotes.length;j++) {
                			 System.out.println(notes[j]+" : "+numnotes[j]);
                		 }
                	 }
                	 
                }
	
	}              

}

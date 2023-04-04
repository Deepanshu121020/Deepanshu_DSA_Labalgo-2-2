package com.gl.currency_payment;

import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Currency Denominations");
		int size = sc.nextInt();
		
		
		int [] denomination_value = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the currency denomination value " +(i+1));
			denomination_value[i] = sc.nextInt();
		}
			MergeSort ms = new MergeSort();
			ms.sort(denomination_value,0,size-1);
			
			System.out.println("Enter amount you want to pay ");
			int amount = sc.nextInt();
		 
			CurrencyCount cc = new CurrencyCount();
			cc.counting(denomination_value,amount);
		}
		
	
}

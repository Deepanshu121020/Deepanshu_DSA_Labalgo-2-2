package com.gl.currency_payment;

public class CurrencyCount {

	public void counting(int[] denomination_value, int amount) {
		
		int [] currencyCount = new int[denomination_value.length];
		int i;
		int sumofcurrency=0;
		for(i=0;i<denomination_value.length;i++) {
			currencyCount[i]=amount/denomination_value[i];
			 amount = amount%denomination_value[i];
			 sumofcurrency+=currencyCount[i];
		}
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(i=0;i<denomination_value.length;i++) 
		{
			if(currencyCount[i]!=0) {

				
				System.out.println(denomination_value[i]+" : "+currencyCount[i]);
			}
		}
		
	}

}

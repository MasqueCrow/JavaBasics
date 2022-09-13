package com.controlstructure;

public class BreakTest {

	public static void checkPrime(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 1)
				break;
		}
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		for(int j = 2; j < 100; j++) {
			checkPrime(j);
		}
	}

}

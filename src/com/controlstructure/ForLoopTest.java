package com.controlstructure;

public class ForLoopTest {

	public static int getFactorial(int num) {
		if(num == 1) {
			return num;
		}
		return num * getFactorial(num - 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		System.out.println(getFactorial(n));
		
	}

}

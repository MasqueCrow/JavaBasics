package com.controlstructure;

public class DoWhileLoop {

	public static int getFib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		return getFib(n-1) + getFib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums = 10;
		
		do{
			System.out.println(getFib(nums));
			nums--;
		}while(nums > 0);
	}

}

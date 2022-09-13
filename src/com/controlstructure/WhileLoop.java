package com.controlstructure;

public class WhileLoop {

	public static void main(String[] args) {
		String s = "abba";
		boolean isPalindrome = true;
		int start_idx = 0;
		int end_idx = s.length() - 1;
		
		while(isPalindrome){
			if (s.charAt(start_idx) != s.charAt(end_idx)){
				isPalindrome = false;
				break;
			}
			
			//terminate loop when every character has been checked
			if(end_idx == 0){
				break;
			}
			
			start_idx++;
			end_idx--;
		} 
		
		if(isPalindrome) {
			System.out.println(s + " is a palindrome");
		}else{
			System.out.println(s + " is not a palindrome");
		}
	
	
	} //main
} //class

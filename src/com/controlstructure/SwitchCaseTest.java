package com.controlstructure;

public class SwitchCaseTest {

	public static void main(String[] args) {
		char c = 'a';
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		for(char vowel : vowels){
			if(c == vowel ){
				System.out.println(c + " is a vowel");
			}
		}
	
	}//main
} //method

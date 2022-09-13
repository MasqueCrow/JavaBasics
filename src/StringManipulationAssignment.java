
public class StringManipulationAssignment {

	public static void main(String[] args) {
		//Qn1
		String input = "computer";
		String res =  "";
		for(int i = input.length() - 1; i > -1; i--) {
			if(i != 0 ) {
				res += input.charAt(i) + "-";
			}else {
				res += input.charAt(i);
			}
		}
		
		System.out.println(res);
		System.out.println("=====================");
		
		//Qn2
		String s1 = "abcxXXcxerxxXXwer";
		String s2 = "";
		String sx = "";
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != 'x') {
				s2 += s1.charAt(i);
			}else {
				sx += 'x';
			}
		} //for
		
		System.out.println(s2 + sx);
		System.out.println("=====================");
		
		//Qn3
		String input2 = "Hello World";
		char startChar = input2.charAt(0);
		char endChar = input2.charAt(input2.length() - 1);
		
		System.out.println(endChar + input2.substring(1, input2.length() - 1) + startChar);
		System.out.println("=====================");

		//Qn4
		String input3 = "Hi How are you";
		String[] input3Arr =  input3.split(" ");
		int maxLength = 0;
		String res3 = "";
		
		for(String word: input3Arr) {
			if(word.length() > maxLength) {
				maxLength = word.length();
				res3 = word;
			}
		}
		
		System.out.println(res3);
		System.out.println("=====================");
		
		//Qn5
		String input4 = "Sofra Service Limited";
		String[] input4Arr = input4.split(" ");
		String res4 = "";
		
		for(String word: input4Arr) {
			res4 += word.charAt(0);
		}
		
		System.out.println(res4);
		System.out.println("=====================");
		
		//Qn6
		String input5 = "Sofra Service Limited";
		String[] input5Arr = input5.split(" ");
		int c_idx = 0; 
		String res5 = "";
		
		for(String word: input5Arr) {
			res5 += Character.toUpperCase(word.charAt(c_idx));
			c_idx++;
		}
		
		System.out.println(res5);
		System.out.println("=====================");
		
		//Qn7
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		String input6 = "hello java";
		
		String res6 = "";
		
		for(int i = 0; i < input6.length(); i++) {
			char current_char = input6.charAt(i);
	
			for(int j = 0; j < alphabet.length; j++) {
				if(current_char == ' '){
					res6 += ' ';
					break;
				} else if(current_char == alphabet[j]) {
					res6 += alphabet[j+1];
					break;
				}

			} //for	
		} //for
		
		System.out.println(res6);
		System.out.println("=====================");
		
	} //main 
} //class

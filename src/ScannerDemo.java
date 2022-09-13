import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("What is your name?");
			String input = sc.nextLine();
			
			if(input.isEmpty()) {
				break;
			}
			System.out.println("Welcome " + input);
		} //while
		
		sc.close();
		System.out.println("Goodbye");
	} //main

} //class

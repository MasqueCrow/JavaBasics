public class ControlStructure {
	public static void main(String[] args) {
		System.out.println("if else example");
		
		int x = 3;
		int y = 3;
		
		if(x < y){
		 System.out.println("x is less than y");	
		}else if(x == y){
			System.out.println("x is equal to y");
		}else {
			System.out.println("x is greater than y");
		}
		
		System.out.println("========================");
		
		String time = "night";
		
		switch(time) {
			case "morning":{
				System.out.println("Good Morning!");
				break;
			}
			case "afternoon":{
				System.out.println("Good Afternoon!");
				break;
			}
			case "evening":{
				System.out.println("Good Evening!");
				break;
			}
			default:{
				System.out.println("Have a nice day!");
			}
		} //switch
		
		System.out.println("========================");
		System.out.println("For loop example");
		
		for(int i = 0; i < 5; i++) {
			if(i == 3){
				continue;
			}
			System.out.println("Hello " + i);
		} //for
		
		System.out.println("Foreach loop example");
		
		int[] nums = {10, 20, 30, 40, 50, 60, 70};
//		
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println("nums of i: " + i + " " + nums[i]);
//		}
		
		for(int n : nums) {
			System.out.println(n);
		}
		
		System.out.println("========================");
		System.out.println("while loop example");
		
		int j = 5;
		
		while(j < 5){
			System.out.println(j);
			j++; 
		} //while
		
		System.out.println("========================");
		System.out.println("do while loop example");
		
		j = 5;
		
		do{
			System.out.println(j);
			j++; 
		}while(j < 5); //do-while
		
		
	
	} //main
} //class

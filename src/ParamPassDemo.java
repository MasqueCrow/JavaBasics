class Num{
	public int n; //instance variable of Num class which hold int value.
	
}

public class ParamPassDemo {

	public void modify(String str) {
		System.out.println("Inside modify(String)");
		str = "10";
		System.out.println("Exiting modify(String):" + str);
	}
	
	public void modify(Num num) {
		System.out.println("Inside modify(Num)");
		num.n = 10;
		System.out.println("Exiting modify(Num):" + num.n);
	}
	
	public void modify(int n) {
		System.out.println("Inside modify(n)");
		n = 10;
		System.out.println("Exiting modify(n):" + n);
	}
	
	public static void main(String[] args) {
		System.out.println("inside main");
		
		ParamPassDemo demo = new ParamPassDemo();
		int n = 5;
		
		System.out.println("Before calling modify:" + n);
		
		demo.modify(5);
		
		System.out.println("After calling modify:" + n);
		System.out.println("==============================");
		
		Num num = new Num();
		num.n = 5;
		
		System.out.println("Before calling modify:" + num.n);
		
		demo.modify(num);
		
		System.out.println("After calling modify:" + num.n);
		System.out.println("==============================");
		
		String str = "5"; //String is immutable
		
		System.out.println("Before calling modify(String):" + str);
		demo.modify(str);
		System.out.println("After calling modify(String):" + str);
		
		System.out.println("outside main");

	}
}

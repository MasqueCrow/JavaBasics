
public class OperatorDemo {
	public static boolean isPositive(int n) {
		System.out.println("Inside isPositive method");
		if(n>0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c = a++ + ++b;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		System.out.println("--==============--");
		int x = 5;
		int y = 3;
		if(isPositive(x) && isPositive(y)) {
			System.out.println("Both numbers are positive");
		}else {
			System.out.println("Both numbers are not positive");
		}
		
	}
}

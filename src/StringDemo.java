
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "world";
		
		// points to the same memory location
//		String s1 = "abc";
//		String s2 = "abc";
		
//		s1 = s1 + s2;
//		System.out.println(s1);

		// == compares references (memory location), .equals() compares content/value
		if (s1 == s2) {
			System.out.println("Both are pointing to the same memory");
		}else {
			System.out.println("Both are pointing to different memory");
		}
		
		System.out.println("=========================");
		System.out.println("concat:" + s1.concat(s3));
		System.out.println("uppercase:" + s1.toUpperCase());
		System.out.println("lowercase:" + s1.toLowerCase());
		System.out.println("length:" + s1.length());
		System.out.println("indexOf:" + s1.indexOf('l'));
		System.out.println("lastIndexOf:" + s1.lastIndexOf('l'));
		System.out.println("substring:" + s1.substring(1, 4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} //main
} //class

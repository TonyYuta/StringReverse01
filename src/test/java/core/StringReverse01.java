package core;

public class StringReverse01 {
	public static void main(String[] args) {
		String originString = "This is my String";
		String reverseString = new StringBuffer(originString).reverse().toString();
		System.out.println("My origin String: " + originString);
		System.out.println("My reverse String: " + reverseString);
	}
}
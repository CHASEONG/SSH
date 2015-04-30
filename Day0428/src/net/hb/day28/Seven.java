package net.hb.day28;

public class Seven {
	public static void main(String[] args) {// Page 74, 80
		System.out.println("Seven.java ");
		int a = 3, b = 6;
		// 10진수 3을 2진수 = 0000 0011
		// 10진수 6를 2진수 = 0000 0110

		int c = a & b;
		int d = a | b;
		int e = a ^ b;
		System.out.println(a + "&" + b + "=" + c);
		System.out.println(a + "|" + b + "=" + d);
		System.out.println(a + "^" + b + "=" + e);
	}// main end
}// class end

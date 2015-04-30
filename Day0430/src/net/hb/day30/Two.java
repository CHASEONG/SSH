package net.hb.day30;

public class Two {// 상수

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		int sum1 = 0, sum2 = 0, sum3 = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "  ");
			sum1 = sum1+i;
		}// for end
		System.out.println("\n합계 = " + sum1);
	}// main end
}// class end

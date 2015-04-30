package net.hb.day30;

public class First {// 상수

	public static void main(String[] args) {
		System.out.println("First.java");
		double rate = 78.9;
		int kor; //초기값이 없어도 아래에 값변경이 있기 때문에 에러X
		final double PI = 3.1415;// 상수는 변수를 대문자로 권유.->변수앞에 final = 상수로 바뀜 .
		final int SIZE = 20;//상수라도 초기값을 던져줘야 함 .
		String com = "SM회사";
		
		//클래스 앞에 final class String{  } 상속하지 못함
		rate = 12.3; // 변수는 값이 변경가능
		kor = 45;// 변수 = variable=값이 고정이 아니라 변경가능
		// PI = 6.7;
		// SIZE = 100;
		// com = "한빛ENI교육센터";
		System.out.println("국어=" + kor);
		System.out.println("크기+" + SIZE);

	}// main end
}// class end

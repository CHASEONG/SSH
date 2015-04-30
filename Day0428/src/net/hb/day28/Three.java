package net.hb.day28;

public class Three {
	public static void main(String[] args) {
		System.out.println("Three.java");

		// 좌항 연산 우항==>이항식
		// 단항식=>1씩 증가, 1씩 감소
		int a = 4, b = 4, c = 0;
		int sum1 = 0, sum2 = 0;

		// sum1 = --a + 3;//++있으면 a는 무조건 1씩 증가
		// sum2 = b-- + 3;//++있으면 b는 무조건 1씩 증가
		// System.out.println("a=" + a + "\tsum1=" + sum1);
		// System.out.println("b=" + b + "\tsum2=" + sum2);

		++a;//단독일떄는 ++의 위치가 전혀 상관이 없음 
		b++;
		System.out.println("a=" + b);
		System.out.println("b=" + b);

	}// main end
}// class end

package net.hb.day28;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		System.out.println("Two.java");

		int age; // ����
		age = 1; // ������=�Ҵ�=assignment->�ʱ�ȭ

		double mom = 1, ki = 100;

		Scanner stdIn = new Scanner(System.in);
		System.out.print("�����Է�? ");
		age = stdIn.nextInt();
		System.out.print("Ű? ");
		ki = stdIn.nextDouble();
		System.out.print("������? ");
		mom = stdIn.nextDouble();
		System.out.println("");
		System.out.println("---------------------");
		System.out.println("����= " + age + " ��" + "\nŰ= " + ki + " cm" + "\n������= " + mom + " kg");
		System.out.println("---------------------");
		System.out.println("\n��������� 10:31");
		stdIn.close();
	}// main end
}// class end

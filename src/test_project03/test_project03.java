package test_project03;

import java.util.Scanner;

import test_project03_soyoung.Diesel;

public class test_project03 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Diesel disel = new Diesel();
		int num;
		System.out.println("===���� ������===");
		while(true) {
			System.out.println("1.�ֹ���");
			System.out.println("2.����");
			disel.putDiesel();
			System.out.println("3.����");
			System.out.println("4.���");
			System.out.println("5.����");
			System.out.println(">>> : ");
			num = input.nextInt();
			
			switch(num) {
			}
		}
	}
}

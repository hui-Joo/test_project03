package test_project03;

import java.util.Scanner;

import test_project03_soyoung.Diesel;

public class test_project03 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Diesel disel = new Diesel();
		int num;
		System.out.println("===웰컴 주유소===");
		while(true) {
			System.out.println("1.휘발유");
			System.out.println("2.경유");
			disel.putDiesel();
			System.out.println("3.등유");
			System.out.println("4.계산");
			System.out.println("5.세차");
			System.out.println(">>> : ");
			num = input.nextInt();
			
			switch(num) {
			}
		}
	}
}

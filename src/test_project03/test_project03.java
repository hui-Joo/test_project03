package test_project03;

import java.util.Scanner;

<<<<<<< HEAD
import test_project03_soyoung.Diesel;
=======
import test_project03_lampoil.LampOil_hjm;
>>>>>>> 7c1597f94f6a28040f022794a1f77c19d95bb6b1

public class test_project03 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
<<<<<<< HEAD
		Diesel disel = new Diesel();
=======
		LampOil_hjm hjm = new LampOil_hjm();
>>>>>>> 7c1597f94f6a28040f022794a1f77c19d95bb6b1
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
			case 1:
				System.out.println("휘발유");
				break;
			case 2:
				break;
			case 3:
				System.out.println("등유");
				hjm.LampOil();
				break;
			case 4:
				System.out.println("계산");
				break;
			case 5:
				System.out.println("세차");
				break;
			}
		}
	}
}

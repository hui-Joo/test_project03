package test_project03;

import java.util.Scanner;

import test_project03_gas.gas;
import test_project03_joohui.Wash_joohui;
import test_project03_lampoil.LampOil_hjm;
import test_project03_soyoung.Diesel;



public class test_project03 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Diesel disel = new Diesel();
		LampOil_hjm hjm = new LampOil_hjm();
		gas gas = new gas();

		
		Wash_joohui wa = new Wash_joohui();


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
			case 1:
				System.out.println("�ֹ���");
				gas.gas();
				break;
			case 2:
				break;
			case 3:
				System.out.println("����");
				hjm.LampOil();
				break;
			case 4:
				System.out.println("���");
				break;
			case 5:
				System.out.println("����");
				wa.Wash();
				break;
			}
		}
	}
}

package test_project03_lampoil;

import java.util.concurrent.TimeUnit;

public class LampOil_hjm {

	public void LampOil() {
		System.out.println("������ �����մϴ�");
		System.out.println("5�� ���");
		try {
			for(int i =1; i<=5; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(i+"��...");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���� �Ϸ�!");
		
	}
}

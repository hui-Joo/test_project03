package test_project03_lampoil;

import java.util.concurrent.TimeUnit;

public class LampOil_hjm {

	public void LampOil() {
		System.out.println("등유를 주유합니다");
		System.out.println("5초 대기");
		try {
			for(int i =1; i<=5; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(i+"초...");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("주유 완료!");
		
	}
}

package testNG;

import org.testng.annotations.Test;

public class DriveACar {
	
	@Test(priority = 0)
	public void startthecar() {
		System.out.println("start the car");
		
	}
	@Test(priority = 1)
	public void putfirstgear() {
		System.out.println("put first gear");
			
	}
	@Test(priority = 2)
	public void putsecondgear() {
		System.out.println("second gear");
		
	}
	@Test(priority = 3)
	public void putthirdgear() {
		System.out.println("thirdgear");
			
	}

}

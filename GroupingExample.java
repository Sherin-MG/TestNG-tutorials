package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	/*
	 scenario:A big basket is containing different types of mobiles
	 such as apple,vivo,moto,lenovo I want to run test only for vivo and moto
	 */
	@Test(groups = "apple")
	public void apple() {
		System.out.println("apple testing");
		
	}
	@Test(groups = "apple")
	public void apple2() {
		System.out.println("apple testing");
		
	}
	@Test(groups = "vivo")
	public void vivo() {
		System.out.println("vivo testing");
		
	}
	@Test(groups = "vivo")
	public void vivo2() {
		System.out.println("vivo testing");
		
	}
	@Test(groups = "moto")
	public void moto() {
		System.out.println("moto testing");
		
	}
	@Test(groups = "moto")
	public void moto2() {
		System.out.println("moto testing");
		
	}
	@Test(groups = "lenovo")
	public void lenovo() {
		System.out.println("lenovo testing");
			
	}
	@Test(groups = "lenovo")
	public void lenovo2() {
		System.out.println("lenovo testing");
			
	}

}

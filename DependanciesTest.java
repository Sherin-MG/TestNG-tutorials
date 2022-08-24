package testNG;

import org.testng.annotations.Test;

public class DependanciesTest {
	
	//TO join College
	
	@Test(enabled = true)
	public void PassSecondary() {
		System.out.println("secondary");
		
	}
	@Test(dependsOnMethods = "PassSecondary",enabled = true)
	public void PassHigherSecondary() {
		System.out.println("Highersecondary");
		
	}
	@Test(dependsOnMethods = "PassHigherSecondary")
	public void college() {
		System.out.println("college");
		
	}

}

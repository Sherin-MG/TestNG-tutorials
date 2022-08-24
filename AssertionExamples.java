package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionExamples {
	@Test
	public void checkequal() {
		String name="Home";
		if (name.equals("Home")) {
			System.out.println("Equal");
		}
		else {
			System.out.println("not equal");
		}
		Assert.assertEquals("Home", "Home");
	}
	
}

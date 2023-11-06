package demoontest;

import org.testng.Assert;
import org.testng.annotations.Test;

import UserValidation.Validation;

public class Testdata {
	@Test
	public void testCase1()
	{
		Validation uv=new Validation();
		Assert.assertEquals(true,uv.check("srikanth", "sri@123"));
	}
	@Test
	public void testCase2()
	{
		Validation uv=new Validation();
		Assert.assertEquals(false,uv.check("Srinu", "Srinu@12345"));
	}
}

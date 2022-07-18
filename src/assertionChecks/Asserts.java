package assertionChecks;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.LoggingAssert;
import org.testng.asserts.SoftAssert;

public class Asserts {
	
	
	@Test
	public void Check()
	{
		
		boolean a = true;
		boolean b = false;
		boolean c = true;
		SoftAssert Assert1 = new SoftAssert();
		Assert1.assertEquals(a, b, "true1");
		Assert1.assertTrue(b, "true2");
		Assert1.assertFalse(c, "false1");
		Assert1.assertAll("AssertALL");
		Assert.assertTrue(b, "false2");
		
		Assert.assertSame(a, b, "AssertSame");
		Assert.assertNotEquals(Assert1, Assert1);
		
		String s1 = new String("Sumit");
		String s2 =  new String("Sumit");
		String s3 = new String("ABC");
		
		
		Assert.assertEquals(s1, s2, "AssertEquals");
		s1 = "ABCD";
		Assert.assertSame(s2, s1, "assertSame");
		
		
		
	}

}

package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Add {
	static int add(int a,int b) {
		return  a+b;
	}
	@Test
	public void addTest() {
		Add a=new Add();
		assertEquals("error in add()", 4, Add.add(2,2));
		//assertEquals("addition", 2, 2);
	}

}

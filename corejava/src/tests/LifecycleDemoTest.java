package tests;
//import org.junit.jupiter.api.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.;
import org.junit.Test;

public class LifecycleDemoTest {
	@BeforeClass	
 public static void beforeAll() {
	System.out.println("connect to database");
}
@Before
 public void before() {
	System.out.println("load the schema");
	
}
@After
public void after() {
	System.out.println("Drop the schema");
}
@AfterClass
	public  static void afterclass() {
	System.out.println("Disconnect from the database");
		
	}
@Test(timeout=10000)
public void Testone() {
	System.out.println("Test one");
}
@Test(timeout=20000)
public void Testtwo() {
	System.out.println("Test Two");
}
	

}

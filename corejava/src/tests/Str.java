package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class Str {
	int arr[]= {1,2,3,4};
	int arr1[]= {1,2,3,4};
	int arr2[]= {};
@Test
	public  void StrTest(){
	assertArrayEquals(arr,arr1);
	assertNotNull(arr);
	//assertNull(arr2);
}
}

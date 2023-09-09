package basic;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int c=10/5;
			System.out.println("Value of c : "+c);
			int arr[]= {1,2,3};
			arr[2]=2;
			System.out.println(arr);
			int a11=Integer.parseInt("122");
			System.out.println(a11);
			String str=null;
			System.out.println(str);
			String[] data1=new String[-5];
			System.out.println(data1);
			Integer[] intArray = {5, 7, 9, 11, 13, 15};
			System.out.println ( "First element: " + intArray[0]);
			System.out.println ( "Last element: " + intArray[-8]);
			
			int[] numbers = {1, 2, 3, 4, 5};
			int index = -1;
			
			    int x = numbers[index]; 
			    System.out.println(x);}
		
		catch(ArithmeticException e) {
			System.out.println("number cannot be devide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		catch(NumberFormatException s) {
			System.out.println(s);
		}
		catch(NullPointerException t) {
			System.out.println(t);
		}
		catch(NegativeArraySizeException u) {
			System.out.println(u);
		}
	
		finally{
			System.out.println("code executed successfully");
		}

	

}}

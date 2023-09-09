package basic;
        
       import java.io.BufferedInputStream;
		import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


		public class Sum {

			public static void main(String[] args) throws NumberFormatException, IOException {
				// TODO Auto-generated method stub
				int arr[]=new int[10];
				BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
				for(int i=0;i<=arr.length-1;i++)
				{
					System.out.println("enter the element at "+i+" index position");
					arr[i]=Integer.parseInt(bufferedReader.readLine());
					
				}
				int sum=0;
				for(int i=0;i<arr.length;i++) {
					sum+=arr[i];
				}
				System.out.println("sum of the array element is :"+sum);

			}

		


	}


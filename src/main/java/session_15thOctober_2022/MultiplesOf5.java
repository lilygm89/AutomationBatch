package session_15thOctober_2022;

public class MultiplesOf5 {

	public static void main(String[] args) {
		
			
		}
		//WAP to print first 100 multiple of 5 and add those multiples 
				//5, 10, 15..........................500
				//5 + 10 + ..........................500 = Value
				
				int k = 5;
				int sum = 0;{
				while (k <= 5*100) {
					System.out.print(k + " ");
					sum = sum+k; //sum = 0 + 5 + 10 + 15 + 20 + 25
					k=k+5;
				}
				System.out.println();
				System.out.println("Final sum is : " + sum);
				
			
		
	}
				
}

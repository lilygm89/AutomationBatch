package session_15thOctober_2022;

public class While_Loop {
	
	//While loop is mostly used for infinite kind of a situation
	//While is repeated if statement

	public static void main(String[] args) {
		
		while (1 < 2) {
			System.out.println("Logic is true");
			break;
		}
		
		
		int 1 = 10; //latest value of i is 10
		while(i<=11) { //10 < 11 (true)
			System.out.println("Print the value of i : " + i);
			
			i++; // i becomes  11
		}
		
		//WAP to print 1st 50 natural numbers using while loop
		
		int j = 1;
		while(j<=50) {
			System.out.println(j + " ");
			j = j+1;
		}
		
		
		//WAP to print first 100 multiple of 5 and add those multiples 
		//5, 10, 15..........................500
		//5 + 10 + ..........................500 = Value
		
		int k =5;
		int sum = 0;
		while (k <= 5*100) {
			System.out.println(k + " ");
			k++;
			System.out.println();
			sum = sum+k;
			
		}
		System.out.println("Final sum is : " + sum);
	}

}

package session_15thOctober_2022;

public class If_Else_Statements {

	public static void main(String[] args, boolean condition) {
		
		if(condition) {
			//print the logic
		}else if(condition) {
			//print the logic
			
			
			
			int a = 1;
			int b = 2;
			
			if(a > b)  //false
				
			{
				System.out.println("My Logic is correct");
			}
			
			else if (a >= b) //false
				
			{
				System.out.println("My Logic is incorrect");
			}
			{
			System.out.println("Finally something works");
			
			}
			// write a java program to find the greatest & smallest of 4 numbers
			
			int a1 = 10;
			int b1 = 20;
			int c = 30;
			int d = 40;
			
// use the logic of if and else and print the greatest and the smallest of the 4 numbers
			
			if(a1>b1 && a1>c && a1>d) {
				System.out.println("a is the greatest :" + a1);
			} else if (b1>a1 && b1>c && b1>d) {
				System.out.println("b is the greatest :" + b1);
			} else if (c>a1 && c>b1 && c>d) {
				System.out.println("c is the greatest :" + c);
			} else if (d>a1 && d>b1 && d>c) {
				System.out.println("d is the greatest :" + d);
			}
			
		    
		}

	}

}

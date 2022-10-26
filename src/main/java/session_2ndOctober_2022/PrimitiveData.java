package session_2ndOctober_2022;

public class PrimitiveData {

	public static void main(String[] args) {
		// int
		
		int i = 1;
		int j = -2;
		
//-2147483648 to 21747483647 (range of int in java)
		
		int k = 2147483647;
		int l = -2147483648;
		
		int m = 10; //here the value of m is 10
		m = 11;    // I changed the value of m to 11
		m = 12; 
		System.out.println(m);
		System.out.println(15);
		
		// a data type will not be accommodating another data type
		
		// int range is -2147483648 to 21747483647
		// long -9223372036854775808 to 9223372036854775807
		//short - 32678 to 32677
		
		
		char c = 'a';
		char c1 = ' ';
		char c2 = '#';
		char c3 = '1';
		
		boolean b1 = 1<2; //this statement is true
		System.out.println(b1);
		boolean b2 = 191.123 < 190.123;
		System.out.println(b2);
		
		boolean b3 = true;
		boolean b4 = false;
		boolean b5 = (b3!=b4); // true statement
		boolean b6 = (b4 == b4); //false statement
		System.out.println(b5);
		
		double d = 1.1;
		System.out.println(d);
		

	}

}

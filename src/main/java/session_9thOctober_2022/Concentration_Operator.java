package session_9thOctober_2022;

public class Concentration_Operator {

	//concentration is joining, it is not adding
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 20;
		System.out.println(i+j); //30
		
		char c1 = 'a'; //ascii value
		char c2 = '1';
		System.out.println(c1+c2);
		
		String name1 = "Karina";
		String name2 = "Mina";
		System.out.println(name1 + name2);
		
		System.out.println(i+j+name1+name2); //30KarinaMina
		System.out.println(name1+name2+i+j); //KarinaMina1020
		System.out.println(name1+name2+(i+j)); //KarinaMina30
		
		
		
	}

}

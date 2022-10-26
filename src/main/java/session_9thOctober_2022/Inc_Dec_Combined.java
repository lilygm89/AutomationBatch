package session_9thOctober_2022;

public class Inc_Dec_Combined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		//latest Value of i is 1
		
		int j = ++i - --i;
		// i  = 2        1
		// j =  1+1  -  2  - 1 = 1
		
		//latest value if i is 1 and j is 1
		
		int k = j-- - --i + i-- - --j;
		
		int l = --k - k-- + i-- - --i + j++ - --j;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		
	}

}

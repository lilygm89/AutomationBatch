package session_9thOctober_2022;

public class Increment_Operations_Combine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		// latest value iof i is 1
		int j = i++   +    ++i;
		// i      2          3
		// j = 1     +     1+2 = 4
		
		//latest value of i is 3, j is 4
		
		int k = ++j + j++;
		// j = 5       6
		//k = 1+4   +  5 = 10
		
		// latest value of i is 3, j becomes 6, k becomes 10
		
		
	    int l = k++ + ++k + k++ + i++;
	    
	    //i                         4
	    //k = 11     12      13
	    //l = 10   +  1+11  + 12  + 3 = 37
	    
	    
	    System.out.println(i);// 4
	    System.out.println(j);// 
	    System.out.println(k);
	    System.out.println(l);
	    
	    //Farhan - 5, 5, 35, 50
	    //Rosana/Asma/Masom - 4, 6, 13, 37 (correct answer)
	    //Atefah - 1, 3, 5, 16
	    //Gazal - 5, 4, 9, 2
	    //Nilufar - 3, 5, 11, 29
	    	
	    
	}

}

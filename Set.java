package Set;
import java.util.*;
public class Set {
    
		    public static int bit(int num1)
		    {
		        if(num1==0)
		            return 1;
		        int rrr =  2 * bit(num1-1);
		        return rrr;
		    }
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		 if(a==b)
	        {
	            System.out.println(bit(a));
	        }
	        else
	        System.out.println(bit(a)+bit(b));
	    }
		
	}
	
		


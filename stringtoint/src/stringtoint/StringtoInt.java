package stringtoint;

import java.util.*;  

public class StringtoInt {

	public static void main (String args[])
    {
		Scanner sc= new Scanner(System.in);
        System.out.println("String Before Conversion :  ");
        String str= sc.nextLine(); 
        int output=    stringToint( str );
        System.out.println("");
        System.out.println("");
        System.out.println("int value as output "+ output);
        System.out.println("");
    }
    
    
    public static int stringToint( String str ){
    	int answer = 0, factor = 1;
        for (int i = str.length()-1; i >= 0; i--) {
        	if((str.charAt(i)>'0') && (str.charAt(i)<'9'))
        	{
        		answer += (str.charAt(i) - '0') * factor;
                factor *= 10;
        	}  
        }
        return answer;
    }   

}

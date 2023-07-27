
import java.util.*;


public class lastNonZeroDigit {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int fact = factorial2(n);
       System.out.println(fact);
       System.out.println(lastNonZeroDigit(fact));
   }
   
   //find factorial
   public static int factorial2(int n){
	    int[] factorials = new int[n+1];
	    Arrays.fill(factorials, 1);
	    for(int i = 0; i <= n-1; i++){
	       factorials[i+1] = (i+1)*factorials[i];
	     }
	     return factorials[n];
	}
   
   // Method to find the last digit of n!
  static int lastNonZeroDigit(int fact) {
       
	   String checkVal = Integer.toString(fact);
	   int len = checkVal.length();
	   char last = checkVal.charAt(len - 1);
	   String lastChar = Character.toString(last);
	   int lastNum = Integer.parseInt(lastChar);
	   if(lastNum != 0) {
		   return lastNum;
	   } else {
		   return lastNonZeroDigit(fact / 10);
	   }
   }
}

import java.io.*;
import java.util.*;

public class Solution {
	static boolean isAnagram(String a, String b) {
        // Complete the function
       // a = a.toLowerCase();
        b = b.toLowerCase();
        StringBuilder sA = new StringBuilder(a);
        StringBuilder sB = new StringBuilder(b);
       // System.out.println(sA.length());
        int length = sA.length();
        if (a.length() == b.length()){
            for (int i = length-1; i > 0; i--){
               // System.out.println(i);
                //System.out.println(sA.charAt(i));
                if (sB.indexOf(Character.toString(sA.charAt(i))) >= 0 ){
                   // System.out.println(sA);
                    char deleteChar = sA.charAt(i);
                    sA.deleteCharAt(i);
                  //  System.out.println(sA);
                    //sB.indexOf(Character.toString(sA.charAt(i)))
                    sB.deleteCharAt(sB.indexOf(Character.toString(deleteChar)));
                }else {
                    return false;        
                }
            }
            return true;
        } else {
           return false;
        }
        
    }
		  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

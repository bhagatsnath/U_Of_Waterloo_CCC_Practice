/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 13, 2026
 * Question 4
 */
import java.util.*;
public class Practice4 {
    public static void main(String[]args){
        String testString = "PSPSSPPS";
        //String testString = "SPPSS";

        int left = 0;
        int right = 0;
        int pCount = 0;
        int maxLength = 0;

        int maxSubStringStart = 0;
        int maxSubStringEnd = 0;

        for(right = 0; right < testString.length(); right++) {
            if(testString.charAt(right) == 'P') {
                pCount++;
            }
            while(pCount > 1) {
                if(testString.charAt(left) == 'P') {
                    pCount--;
                }
                left++;
            }

            if(maxLength < (right - left + 1)) {
                maxLength = right - left + 1;
                maxSubStringStart = left;
                maxSubStringEnd = right;

            }
            //maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);

    }
}

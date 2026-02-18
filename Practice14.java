/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 18, 2026
 * Question 1 of 2022
 */
import java.util.*;
public class Practice14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int s = sc.nextInt();
        int totalCupcakesinBox = r*8+s*3;
        System.out.println(totalCupcakesinBox-28);
    }
}

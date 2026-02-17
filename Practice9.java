/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 17, 2026
 * 2023 Question 1
 */
import java.util.*;
public class Practice9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int c = sc.nextInt();
        int score = 50*p-10*c;
        if (p>c){
            score = score+500;
        }
        System.out.println(score);
    }
}

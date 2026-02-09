/**
 * Author: Bhagat Sabari Nath
 * Date: Jan 10, 2026
 *  Question 1
 */
import java.util.*;
public class Practice1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();
        if ((c*p)>=n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

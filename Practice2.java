/**
 * Author: Bhagat Sabari Nath
 * Date: Jan 10, 2026
 *  Question 1
 */
import java.util.*;
public class Practice2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int E = sc.nextInt();
        int R = D;
        for (int i = 1; i<=E; i++){
            char symbol = sc.next().charAt(0);
            int Q = sc.nextInt();
            if (symbol=='+'){
                R = R+Q;
            }
            else if (symbol=='-'){
                R = R-Q;
            }
        } 
        System.out.println(R);
    }
}

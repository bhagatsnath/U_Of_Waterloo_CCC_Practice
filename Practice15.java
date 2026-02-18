/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 18, 2026
 * Question 2 of 2022
 */
import java.util.*;
public class Practice15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int playerCount = 0;
        for (int i =0; i<n; i++){
            int scoredPoints = sc.nextInt();
            int lostPoints = sc.nextInt();
            if (scoredPoints*5-lostPoints*3>40){
                playerCount++;
            }
        }
        if (playerCount==n){
            System.out.println(playerCount+"+");
        }
        else{
            System.out.println(playerCount);
        }
    }
}

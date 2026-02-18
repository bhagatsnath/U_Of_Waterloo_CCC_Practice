/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 17, 2026
 * Question 4 of 2023 right way
 */
import java.util.*;
public class Practice13 {
    //0011001
    //0101111
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int total = 0;
        int[] r1 = new int[c];
        int[] r2 = new int[c];

        // Read input as integers
        for(int i=0; i<c; i++) r1[i] = sc.nextInt();
        for(int i=0; i<c; i++) r2[i] = sc.nextInt();

        for(int i=0; i<c; i++) {
            if(r1[i] == 1) {
                total += 3;
                // Check horizontal neighbor in Row 1
                if(i > 0 && r1[i-1] == 1) total -= 2;
            }
            if(r2[i] == 1) {
                total += 3;
                // Check horizontal neighbor in Row 2
                if(i > 0 && r2[i-1] == 1) total -= 2;
            }
            // Check vertical connection (only on even indices: 0, 2, 4...)
            if(i % 2 == 0 && r1[i] == 1 && r2[i] == 1) {
                total -= 2;
            }
        }
        System.out.println(total);
    }
}
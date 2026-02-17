/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 17, 2026
 * Question 2 of 2023
 */
import java.util.*;
public class Practice10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalSpiceness = 0;
        for (int i =0; i<n; i++){
            String pepper = sc.next();
            if (pepper.equals("Poblano")){
                totalSpiceness = totalSpiceness+1500;
            }
            else if (pepper.equals("Mirasol")){
                totalSpiceness = totalSpiceness+6000;
            }
            else if (pepper.equals("Serrano")){
                totalSpiceness = totalSpiceness+15500;
            }
            else if (pepper.equals("Cayenne")){
                totalSpiceness = totalSpiceness+40000;
            }
            else if (pepper.equals("Thai")){
                totalSpiceness = totalSpiceness+75000;
            }
            else if (pepper.equals("Habanero")){
                totalSpiceness = totalSpiceness+125000;
            }   
        }
        System.out.println(totalSpiceness);
    }
}

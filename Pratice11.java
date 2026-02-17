/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 17, 2026
 * Question 3 of 2023
 */
import java.util.*;
public class Pratice11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mondayAvailableon = 0;
        int tuesdayAvailableon = 0;
        int wednesdayAvailableon = 0;
        int thursdayAvailableon = 0;
        int fridayAvailableon = 0;
        for (int i =0; i<n;i++){
            String response = sc.next();
            for (int a =1; a<response.length();a++){
                if (response.charAt(a-1)=='Y'){
                    if (a==1){
                        mondayAvailableon++;
                    }
                    else if (a==2){
                        tuesdayAvailableon++;
                    }
                    else if (a==3){
                        wednesdayAvailableon++;
                    }
                    else if (a==4){
                        thursdayAvailableon++;
                    }
                    else if (a==5){
                        fridayAvailableon++;
                    }
                }
            }
        }
            int preferredDay = Math.max(mondayAvailableon,Math.max(tuesdayAvailableon,Math.max(wednesdayAvailableon,Math.max(thursdayAvailableon,fridayAvailableon))));
            if (preferredDay==mondayAvailableon){
                System.out.println(1);
            }
            else if (preferredDay==tuesdayAvailableon){
                System.out.println(2);
            }
            else if (preferredDay==wednesdayAvailableon){
                System.out.println(3);
            }
            else if (preferredDay==thursdayAvailableon){
                System.out.println(4);
            }
            else if (preferredDay==fridayAvailableon){
                System.out.println(5);
            }
        
    }
}

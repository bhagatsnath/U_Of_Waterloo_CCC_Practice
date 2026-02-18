/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 17, 2026
 * Question 4 of 2023 1st attempt
 */
import java.util.*;
public class Practice12 {
    //0011001
    //0101111
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        String row1 = sc.next();
        String row2 = sc.next();
        row1=row1+"00";
        row2=row2+"00";
        ArrayList<Integer> clusterFeatures = new ArrayList<>();
        int trianglesDetected = 0;
        int i =0;
        while(i<row1.length()){
            int a = 1;
            int b = 0;
            if (row1.charAt(i)=='1'){
                trianglesDetected++;
                while (true){
                    if (row1.charAt(i+a)=='1'){
                        trianglesDetected++;
                    }
                    if (row2.charAt(i+b)=='1'){
                        trianglesDetected++;
                    }
                    if (row1.charAt(i+a)=='0'&&row2.charAt(i+b)=='0'){
                        clusterFeatures.add(trianglesDetected);
                        trianglesDetected = 0;
                        break;
                    }
                    a++;
                    b++;
                }
                if (a>b){
                    i=i+a-1;
                }
                else if (b>a){
                    i=i+b;
                }
                else if (a==b){
                    i=a+1;
                }
            }
            else if (row2.charAt(i)=='1'){
                a=0;
                b=1;
                trianglesDetected++;
                while (true){
                    if (row2.charAt(i+b)=='1'){
                        trianglesDetected++;
                    }
                    if (row1.charAt(i+a)=='1'){
                        trianglesDetected++;
                    }
                    if (row1.charAt(i+a)=='0'&&row2.charAt(i+b)=='0'){
                        clusterFeatures.add(trianglesDetected);
                        trianglesDetected = 0;
                        break;
                    }
                }
                if (b>a){
                    i=i+b-1;
                }
                else if (a>b){
                    i=i+a;
                }
                else if (a==b){
                    i=a+1;
                }
            }
            i++;
        }
        int totalTapeMeasure = 0;
        for (int x =0; x<clusterFeatures.size();x++){
            totalTapeMeasure += (clusterFeatures.get(x)+2);
        }
        System.out.println(totalTapeMeasure);
    }
}

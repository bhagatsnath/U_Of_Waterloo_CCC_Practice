/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 15, 2026
 * Problem 3
 */
import java.util.*;
public class Practice7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> scores = new ArrayList<>();
        int n = sc.nextInt();
        for (int i =0; i<n;i++){
            scores.add(sc.nextInt());
        }
        int max = findMax(scores);
        scores.removeAll(Arrays.asList(max));
        max = findMax(scores);
        // List<Integer> myList = new ArrayList();
        // myList.add(max);
        scores.removeAll(Arrays.asList(max));
        max = findMax(scores);
        int countOfBronze = 0;
        int b = 0;
        while (b<scores.size()){
            if (scores.get(b)==max){
                countOfBronze++;
            }
            b++;
        }
        System.out.println(max+" "+countOfBronze);
    }
    public static int findMax(ArrayList<Integer> scores){
        int a = 0;
        int max = scores.get(0);
        while(a<scores.size()){
            if (scores.get(a)>max){
                max = scores.get(a);
            }
            a++;
        }
        return max;
    }
}

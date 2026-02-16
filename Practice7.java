/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 15, 2026
 * Question 3 2024
 */
import java.util.*;
public class Practice7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> scores = new HashMap<>();
        int n = sc.nextInt();
        for (int i =0; i<n;i++){
            Set<Integer> keySet= scores.keySet();
            int scoreInput = sc.nextInt();
            if (keySet.contains(scoreInput)){
                int numOfPeople = scores.get(scoreInput);
                scores.put(scoreInput,numOfPeople+1);
            }
            else{
                scores.put(scoreInput,1);
            }
        }
        List<Integer> keyList = new ArrayList<>(scores.keySet());
        Collections.sort(keyList, Collections.reverseOrder());
        System.out.println(keyList.get(2)+" "+scores.get(keyList.get(2)));
    }
}

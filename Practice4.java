/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 13, 2026
 * Question 4
 */
import java.util.*;
public class Practice4 {
    ArrayList<Integer> indexPlacement = new ArrayList<>();
    ArrayList<Integer> maxConsec = new ArrayList<>();
    static ArrayList<Character> charArray = new ArrayList<>();
    int numConsec = 0;
    boolean extraDayAvailable = true;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Practice4 p = new Practice4();
        int n = sc.nextInt();
        for (int i = 1; i<=n;i++){
            char weather = sc.next().charAt(0);
            charArray.add(weather);
        }
        p.sortingLogic(charArray);
        System.out.println(p.outputLogic());
    }
    public void sortingLogic(ArrayList<Character> c){
        for (int i =0; i<c.size();i++){
            if (c.get(i)=='S'){
                indexPlacement.add(i);
            }
        }
    }
    public int outputLogic(){
        int i =0;
        while (i<indexPlacement.size()){
            int a = indexPlacement.get(i);
            numConsec++;
            try{
                if (!(indexPlacement.get(i+1)==a+1)){
                    if (indexPlacement.get(i+1)==a+2&&extraDayAvailable){
                        numConsec++;
                        extraDayAvailable = false;
                    }
                    else{
                        maxConsec.add(numConsec);
                        numConsec = 0;
                    }
                }
            }
            catch (Exception e){
                
            }
            i++;
        }
        int max = maxConsec.get(0); 
        for (int a =0; i<maxConsec.size();a++){
            if (max<maxConsec.get(a)){
                max = maxConsec.get(a);
            }
        }
        return max;
    }
}

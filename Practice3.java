/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 8, 2026
 *  Question 3
 */
import java.util.*;
public class Practice3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> enterCodes = new ArrayList<>();
        for (int i = 1; i<=N;i++){
            enterCodes.add(sc.next());
        }
        for (int i = 0; i<enterCodes.size();i++){
            codeUpdater(enterCodes.get(i));
        }
    }
    public static void codeUpdater(String code){
        ArrayList <Integer> Numbers = new ArrayList<>();
        String newCode = "";
        for (int i = 0; i<code.length();i++){
            char c = code.charAt(i);
            if (Character.isLetter(c)&&!Character.isLowerCase(c)){
                newCode = newCode+c;
            }
            else if (Character.isDigit(c)||c=='-'){
                int a = i;
                int num;
                String numS ="";
                if (a+1==code.length()){
                    numS = numS+code.charAt(a);
                    num = Integer.parseInt(numS);
                    Numbers.add(num);
                }
                else{
                    numS = numS+code.charAt(a);
                    a = i+1;
                    while (a<code.length()&&!Character.isLetter(code.charAt(a))&&code.charAt(a)!='-'){
                        numS = numS+code.charAt(a);
                        a++;
                    }
                    num = Integer.parseInt(numS);
                    Numbers.add(num);
                    i=a-1;
                }
                
            }
        }
        int sum = 0;
        for (int i = 0; i<Numbers.size();i++){
            sum = sum+Numbers.get(i);
        }
        newCode = newCode+sum;
        System.out.println(newCode);
    }
    //Adding a comment to test the commit
}

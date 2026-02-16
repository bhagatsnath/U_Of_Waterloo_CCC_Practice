/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 15, 2626
 * Question 4 2024
 */
import java.util.*;
public class Practice8 {
    public static void main(String[]args){
        char silentKey = '-';
        char sillyKey = '1';
        char wrongKey = '1';
        //boolean silentKeyInvolved;
        Scanner sc = new Scanner(System.in);
        List<Character> LettersForKeyPressed = new ArrayList();
        List<Character> LettersForWordDisplayed = new ArrayList();
        String keyPressedS = sc.next();
        for (int i = 0; i<keyPressedS.length();i++){
            LettersForKeyPressed.add(keyPressedS.charAt(i));
        }
        String wordDisplayedS = sc.next();

        
        for (int i = 0; i<wordDisplayedS.length();i++){
            LettersForWordDisplayed.add(wordDisplayedS.charAt(i));
        }
        //boolean sillyKeyFound = false;
        boolean silentKeyFound = false;
        
        List<Character> LettersForKeyPressedcopy = new ArrayList<>(LettersForKeyPressed);
        List<Character> LettersForWordDisplayedcopy = new ArrayList(LettersForWordDisplayed);

        LettersForWordDisplayedcopy.removeAll(LettersForKeyPressedcopy);
        wrongKey = LettersForWordDisplayedcopy.get(0);

        LettersForKeyPressedcopy.removeAll(LettersForWordDisplayed);
        if (LettersForKeyPressed.size()!=LettersForWordDisplayed.size()){
            for (int i=0;i<LettersForWordDisplayed.size();i++){
                char letterForKeyPressed = LettersForKeyPressed.get(i);
                char letterForWordDisplayed = LettersForWordDisplayed.get(i);
                if (letterForKeyPressed!=letterForWordDisplayed){
                    int a=i+1;
                    while (a<LettersForKeyPressed.size()){
                        if (LettersForKeyPressed.get(a)!=letterForKeyPressed&&LettersForKeyPressed.get(a)==letterForWordDisplayed){
                            if (LettersForKeyPressedcopy.contains(letterForKeyPressed)){
                                LettersForKeyPressedcopy.removeAll(Arrays.asList(letterForKeyPressed));
                                silentKey = letterForKeyPressed;
                                silentKeyFound = true;
                                sillyKey = LettersForKeyPressedcopy.get(0);
                            }
                            break;
                        }
                        else{
                            a++;
                        }
                    }
                }
            }
            if (!silentKeyFound){
                silentKey = LettersForKeyPressed.get(LettersForWordDisplayed.size());
                LettersForKeyPressedcopy.removeAll(Arrays.asList(LettersForKeyPressed.get(LettersForWordDisplayed.size())));
                sillyKey = LettersForKeyPressedcopy.get(0);
            }
        }
        else{
            sillyKey = LettersForKeyPressedcopy.get(0);
        }

        System.out.println(sillyKey+" "+wrongKey);
        System.out.println(silentKey);
    }
}


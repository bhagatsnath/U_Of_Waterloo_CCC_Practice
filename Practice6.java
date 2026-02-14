/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 14, 2026
 */
import java.util.*;
public class Practice6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int dusaSize = sc.nextInt();
        
        while (true){
            int yobiSize = sc.nextInt();
            if (dusaSize>yobiSize){
                dusaSize = dusaSize+yobiSize;
            }
            else{
                break;
            }
        }
        System.out.println(dusaSize);
    }
}

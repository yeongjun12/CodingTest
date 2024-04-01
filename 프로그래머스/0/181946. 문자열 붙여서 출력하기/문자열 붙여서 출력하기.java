import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        
        
        if(str1.length()>=1 && str2.length()<=10){
            
            String answer = str1.trim()+str2.trim();
             System.out.print(answer);
        }
    }
}
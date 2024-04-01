import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
         StringBuilder result = new StringBuilder();
        
        
          for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                // 특수 문자나 숫자 등은 그대로 출력
                result.append(c);
            }
        }

        System.out.println(result.toString());
        
        
        
    }
}
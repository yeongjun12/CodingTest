import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        
        // 입력 문자열의 각 문자를 처리합니다
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                // 소문자를 대문자로 변환하여 추가합니다
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                // 대문자를 소문자로 변환하여 추가합니다
                result.append(Character.toLowerCase(c));
            } else {
                // 대문자와 소문자가 아닌 문자는 그대로 추가합니다
                result.append(c);
            }
        }
        
        System.out.println(result.toString());
        
        scanner.close();
    }
}

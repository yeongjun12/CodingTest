import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // 알파벳 처음 등장 인덱스를 저장할 배열을 -1로 초기화
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1; // 기본값으로 -1 설정
        }
        
        // 문자열의 각 문자를 검사하여 인덱스 저장
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                // 문자가 처음 등장하는 경우에만 인덱스를 저장
                if (arr[ch - 'a'] == -1) {
                    arr[ch - 'a'] = i; // 현재 문자의 처음 등장 인덱스를 저장
                }
            }
        }
        
        // 배열의 값 출력
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}

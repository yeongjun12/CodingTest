
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 바깥쪽 반복문: 높이 n에 해당하는 행을 생성
        for (int i = 1; i <= n; i++) {
            // 안쪽 반복문: '*' 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 각 행의 출력이 끝나면 줄바꿈 추가
            System.out.println();
        }
    }
}

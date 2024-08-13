import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 케이스의 개수
        int arr[] = { 25, 10, 5, 1 }; // 동전 종류
        int answer[] = new int[4]; // 동전의 개수를 저장할 배열
        
        for (int i = 0; i < count; i++) {
            int money = sc.nextInt();
            
            for (int j = 0; j < arr.length; j++) {
                answer[j] = money / arr[j];
                money = money % arr[j];
            }
            
            // 결과 출력
            for (int num : answer) {
                System.out.print(num + " ");
            }
            System.out.println(); // 각 케이스 결과를 출력한 후 줄 바꿈
        }
        
        sc.close();
    }
}

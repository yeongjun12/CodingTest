import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean[][] arr = new boolean[100][100];
        int count = sc.nextInt();
        int area = 0;
        
        for (int i = 0; i < count; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            for (int j = num1; j < num1 + 10; j++) {
                for (int k = num2; k < num2 + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        area++;
                    }
                }
            }
        }
        
        System.out.println(area);
        sc.close();
    }
}

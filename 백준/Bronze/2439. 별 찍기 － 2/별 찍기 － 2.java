import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        for (int i = 1; i <= count; i++) {
            // 공백 출력
            for (int j = count - i; j > 0; j--) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
    }
}

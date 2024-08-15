import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;

            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }

            if (num == sum) {
                System.out.print(num + " = ");
                for (int j = 0; j < list.size(); j++) {
                    System.out.print(list.get(j));
                    if (j < list.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println(); // 줄바꿈 추가
            } else {
                System.out.println(num + " is NOT perfect.");
            }
        }

        sc.close();
    }
}

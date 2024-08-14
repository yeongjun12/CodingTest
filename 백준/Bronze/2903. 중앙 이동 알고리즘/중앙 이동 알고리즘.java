import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int dot = 0;
        int num = 2;
        
        for(int i = 0; i < count; i++) {
        	num +=  (int) Math.pow(2, i);
        	dot = (int) (Math.pow(num , 2));
        }
        
        System.out.println(dot);
        
        sc.close();
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[31]; 
        
        for(int i = 1; i <= 28; i++) {
            int num = sc.nextInt();
            if(num >= 1 && num <= 30) {
                arr[num] = true;
            }
        }
        
        for(int i = 1; i <= 30; i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}

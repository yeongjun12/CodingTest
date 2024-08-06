import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int num = sc.nextInt();
        int numArr[] = new int[size];
        
        for(int i = 0; i < size; i++) {
        	numArr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < size; i++) {
        	if(num > numArr[i]) System.out.print(numArr[i]+" ");
        }
        
        sc.close();
    }
}

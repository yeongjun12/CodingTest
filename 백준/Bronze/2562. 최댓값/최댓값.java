import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int maxIndex = 0;
        
        for(int i = 0; i < 9; i++) {
        	arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 9; i++) {
        	if(arr[i] > arr[maxIndex]) maxIndex = i;
        }
        System.out.println(arr[maxIndex]);
        System.out.println(maxIndex+1);
        
        sc.close();
    }
}

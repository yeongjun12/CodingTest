import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        int ArrSize = sc.nextInt();
        int arr[] = new int[ArrSize];    
        
        int count = sc.nextInt();
        
        for(int i = 0; i < count; i++) {
        	int num1 = sc.nextInt(); 
        	int num2 = sc.nextInt(); 
        	int num3 = sc.nextInt(); 
        	
        	for(int j = num1-1; j <= num2-1; j++) {
        		arr[j] = num3;
        	}
        }
        
        for(int num : arr) System.out.print(num + " ");
        sc.close();
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int Arr[] = new int[size];
        
        for(int i = 0; i < size; i++) {
        	Arr[i] = sc.nextInt();
        }
        
        int max = Arr[0],min = Arr[0];
        
        for(int i = 0; i < size; i++) {
        	if(Arr[i] > max) max = Arr[i];
        	if(Arr[i]<min) min = Arr[i];
        }
        
        System.out.println(min + " " + max);
        
        
        sc.close();
    }
}


import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[9][9];
        int max = -1;
        int maxI = 0, maxJ = 0;
        for(int i = 0; i < 9; i++) {
        	for(int j = 0; j < 9; j++) {
        		arr[i][j] = sc.nextInt();
        	}
        }
        
        for(int i = 0; i < 9; i++) {
        	for(int j = 0; j < 9; j++) {
        		if(arr[i][j] > max) {
        			max = arr[i][j]; 
        			maxI = i+1;
        		    maxJ = j+1;
        		}
        	}
        }
        
        System.out.println(max);
        System.out.println(maxI+" "+maxJ);
        sc.close();
    }
}

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> map = new HashMap<>();
        
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5 );
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
        
        double totalScore = 0.0;
        double totalCredits = 0.0;
       
        for(int i = 0; i < 20; i++) {
        	
        	String line = sc.nextLine();
        	
        	String[] lineArr = line.split(" ");
        	
        	String subject = lineArr[0];
        	double credits = Double.parseDouble(lineArr[1]);
        	String score = lineArr[2];
        	if(score.equals("P")) continue;
        	totalScore += map.get(score)* credits;
        	totalCredits += credits;
        	
        }
        
        System.out.println(totalScore/totalCredits);
        
        sc.close();
    }
}

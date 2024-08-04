import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		int time = sc.nextInt();
		
		if((mm + time)>=60) {
			hh += (mm + time)/60 ;
			mm = (mm + time) % 60;
			if(hh >= 24) hh -= 24; 
		}else if((mm + time) < 60) {
			mm += time;
		}
		
		System.out.println(hh+" "+mm);
		sc.close();
		
	}

}

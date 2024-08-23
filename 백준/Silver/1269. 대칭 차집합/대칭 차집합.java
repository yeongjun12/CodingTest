import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	Set<Integer> Aset = new HashSet<>();
    	Set<Integer> Bset = new HashSet<>();
    	
    	String[] strArr = br.readLine().split(" ");
    	int a_Count = Integer.parseInt(strArr[0]);
    	int b_Count = Integer.parseInt(strArr[1]);
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	while(st.hasMoreTokens()) {
    		int num = Integer.parseInt(st.nextToken());
    		Aset.add(num);
    	}
    	
    	st = new StringTokenizer(br.readLine());
    	
    	while(st.hasMoreTokens()) {
    		int num = Integer.parseInt(st.nextToken());
    		Bset.add(num);
    	}
    	
    	Set<Integer> A_Copy = new HashSet<>(Aset);
    	
    	Aset.removeAll(Bset);
    	Bset.removeAll(A_Copy);
    	
    	wr.write(Aset.size()+Bset.size()+"\n");
    	wr.flush();
    	wr.close();
    	br.close();
       
    }
}

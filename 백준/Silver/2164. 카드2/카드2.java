import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
		
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	Queue<Integer> q = new LinkedList<>();
    	int count = Integer.parseInt(br.readLine());
    	
    	for(int i = 1; i <= count; i++) {
    		q.add(i);
    	}
    	
    	int flag = 1;
        
    	while(q.size() != 1) {
    		
    		if(flag % 2 == 1) {
    			q.remove();
    			flag++;
    		}else {
    			q.add(q.remove());
    			flag++;
    		}
    	}
    	wr.write(Integer.toString(q.peek()));
    	wr.flush();
    	wr.close();
    	br.close();
    }
    
}

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
    	
    	String[] strArr = br.readLine().split(" ");
    	int size = Integer.parseInt(strArr[0]);
    	int step = Integer.parseInt(strArr[1]);
    	
    	for(int i = 1; i <= size; i++) {
    		q.offer(i);
    	}
    	
    	wr.write("<");
    	
    	while(!q.isEmpty()) {
    		for(int i = 1; i < step; i++) {
    			q.offer(q.poll());
    		}
    		if(q.size()==1) {
    			wr.write(q.poll()+">");
    		}else {
    			wr.write(q.poll()+", ");
    		}
    	}
    	wr.flush();
    	wr.close();
    	br.close();
    }
    	
    }
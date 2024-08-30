import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
 
public class Main {
	static Deque<Integer> q = new LinkedList<>();
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	
    	int count = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < count; i++) {
    		String[] strArr = br.readLine().split(" ");
    		String str = strArr[0];
    		int num = (strArr.length > 1) ? Integer.parseInt(strArr[1]) : -1;
    		
    		switch(str) {
    		
    		case "push" : push(num);
				break;
			case "pop" : wr.write(pop()+"\n");
				break;
			case "size" : wr.write(size()+"\n");
				break;
			case "empty" : wr.write(empty()+"\n");
				break;
			case "front" : wr.write(front()+"\n");
				break;
			case "back" : wr.write(back()+"\n");
    		
    		}
    	}
    	wr.flush();
    	wr.close();
    	br.close();
    
    	}
    
    public static void push(int num) {
    	q.offer(num);
    }
    
    public static int pop() {
    	if(!q.isEmpty()) {
    		return q.poll();
    	}else {
    		return -1;
    	}
    }
    
    public static int size() {
    	return q.size();
    }
    
    public static int empty() {
    	if(!q.isEmpty()) {
    		return 0;
    	}else {
    		return 1;
    	}
    }
    
    public static int front() {
    	return (q.isEmpty()) ? -1 : q.peek();
    }
    
    public static int back() {
    	//return (q.isEmpty()) ? -1 : ((LinkedList<Integer>) q).getLast();
    	return (q.isEmpty()) ? -1 : q.getLast();
    }
    }
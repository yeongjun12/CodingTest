import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	Map<String,String> map = new HashMap<>();
    	ArrayList<String> list = new ArrayList<>();
    	
    	int count = Integer.parseInt(br.readLine());
        
    	for(int i = 0; i < count; i++) {
    		String[] strArr = br.readLine().split(" ");
    		String name = strArr[0];
    		String isOffDuty = strArr[1];
    		map.put(name, isOffDuty);
    	}
    	
    	for(Map.Entry<String, String> entry : map.entrySet()) {
    		if(entry.getValue().equals("enter")) {
    			list.add(entry.getKey());
    		}
    	}
    	
    	Collections.sort(list, Collections.reverseOrder());
    	
    	for(String s : list) System.out.println(s);
    }
}

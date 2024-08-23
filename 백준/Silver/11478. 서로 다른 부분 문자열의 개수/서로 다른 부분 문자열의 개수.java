import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
       
       Set<String> set = new HashSet<>();
       String str = br.readLine();
       
       
       for(int i = 0; i < str.length(); i++) {
    	   for(int j = i + 1; j <= str.length(); j++) {
    		   set.add(str.substring(i, j));
    	   }
       }
       
       wr.write(Integer.toString(set.size()));
       wr.flush();
       wr.close();
       br.close();
    }
}

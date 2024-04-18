import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


class Solution {
    public String[] solution(String myString) {
		String[] splitArr = myString.split("x");
		List<String> list = new ArrayList<>();
	        
	        for(String str : splitArr){
	            if(!str.isEmpty()) {
	            	list.add(str);
	            }
	        }
	    String[] answer = list.toArray(new String[0]);
	    
	    Arrays.sort(answer);
	        
        return answer;
    }
}
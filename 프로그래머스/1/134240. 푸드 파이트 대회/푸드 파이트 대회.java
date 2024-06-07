import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i < food.length; i++){
            int num = food[i] / 2;
            if(num >= 1){
                for(int j = 0; j < num; j++)  list.add(i);
                }
        }
        
        list.add(0);
        
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        
        Collections.reverse(list);
        
        for(int i = 1; i < list.size(); i++){
            answer += list.get(i);
         }
        
        return answer;
    }
}
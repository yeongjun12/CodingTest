import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
       
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=n-1; i<num_list.length; i++){
            list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i <list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
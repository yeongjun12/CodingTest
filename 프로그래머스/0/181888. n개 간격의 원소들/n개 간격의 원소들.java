import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length/n];
          ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i=0; i<num_list.length; i+=n){
            list.add(num_list[i]);   
        }
        return list;
    }
}
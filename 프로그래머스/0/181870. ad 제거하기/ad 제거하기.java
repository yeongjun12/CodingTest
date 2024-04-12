import java.util.ArrayList;

class Solution {
    public ArrayList<String>  solution(String[] strArr) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                list.add(strArr[i]);
            }
        }
        
        return list;
    }
}
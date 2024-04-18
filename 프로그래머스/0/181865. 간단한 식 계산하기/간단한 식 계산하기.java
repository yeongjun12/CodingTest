class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] binomialArr = binomial.split(" ");
        int num1 = Integer.parseInt(binomialArr[0]);
        int num2 = Integer.parseInt(binomialArr[2]);    
        String operator = binomialArr[1];
        
        switch(operator){
            case "+":
                    answer = num1 + num2;
                    break;
            case "-":
                    answer = num1 - num2;
                    break;
            case "*":
                     answer = num1 * num2;
        }
        return answer;
    }
}
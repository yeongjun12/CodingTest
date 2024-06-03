class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxHeight = 0;
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                width[i] = sizes[i][0];
                height[i] = sizes[i][1];
            }else{
                width[i] = sizes[i][1];
                height[i] = sizes[i][0];
            }
        }
     
            for( int i = 0; i < sizes.length; i++){
                if(width[i] > maxWidth){
                    maxWidth = width[i];
                }
            }
        
             for( int i = 0; i < sizes.length; i++){
                if(height[i] > maxHeight){
                    maxHeight = height[i];
                }
            }
            answer = maxWidth * maxHeight;  
            System.out.printf("가로 최대값: %d, 세로 최대값: %d\n", maxWidth, maxHeight);
        
        return answer;
    }
}
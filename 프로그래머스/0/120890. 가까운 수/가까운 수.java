class Solution {
    public int solution(int[] array, int n) {
        int big = Integer.MAX_VALUE;
        int line;
        int answer = 0;
        for(int i = 0; i<array.length; i++){
            line = Math.abs(n-array[i]);
                if(line < big){
                    big = line;
                    answer = array[i];
                } else if(line == big && array[i] < answer)
                    answer = array[i];
            }
        return answer;
        }
    
}
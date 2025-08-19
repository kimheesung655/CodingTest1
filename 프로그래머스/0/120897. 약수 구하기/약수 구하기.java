class Solution {
    public int[] solution(int n) {
        int yak = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                yak++;
            }
        }
        int[] answer = new int[yak];
        int idx = 0;
        for(int j = 1; j <= n; j++){
            if(n % j == 0){
                answer[idx]=j;
                idx++;
            }
        }
        return answer;
    }
}
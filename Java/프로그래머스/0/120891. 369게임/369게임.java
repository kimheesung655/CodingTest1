class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order > 0){
            int divi = order % 10;
            if(divi == 3 || divi == 6 || divi == 9){
                answer++;
            }
            order /= 10;
        }
        return answer;
    }
}
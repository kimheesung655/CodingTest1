class Solution {
    public int solution(int a, int b) {
        String sum = Integer.toString(a) + Integer.toString(b);
        int answer = Integer.parseInt(sum);
        int mul = 2*a*b;
        if(answer > mul){
            return answer;
        }else{
            return mul;
        }
    }
}
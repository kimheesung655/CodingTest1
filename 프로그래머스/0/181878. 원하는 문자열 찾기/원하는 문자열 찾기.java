class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String lower1 = myString.toLowerCase();
        String lower2 = pat.toLowerCase();
        if(lower1.contains(lower2)){
            answer = 1;
        }else{
            return answer;
        }
        return answer;
    }
}
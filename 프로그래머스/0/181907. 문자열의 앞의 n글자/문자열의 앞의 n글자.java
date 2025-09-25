class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
            for(int j = 0; j < n; j++){
                char ch = my_string.charAt(j);
                answer += ch;
            }
        return answer;
    }
}
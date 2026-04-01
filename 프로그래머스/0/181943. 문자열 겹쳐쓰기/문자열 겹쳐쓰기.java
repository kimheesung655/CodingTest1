class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String change = my_string.substring(0, s);
        String answer = change + overwrite_string + my_string.substring(s + overwrite_string.length());
        return answer;
    }
}
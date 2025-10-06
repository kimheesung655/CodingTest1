class Solution {
    public String solution(String str1, String str2) {
        String ab = "";
        for(int i = 0; i < str1.length(); i++){
            char A = str1.charAt(i);
            char B = str2.charAt(i);
            ab += A;
            ab += B;
        }
        String answer = ab;
        return answer;
    }
}
class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char apl = alp.charAt(0);
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(ch == apl){
                ch = Character.toUpperCase(ch);
            }
            answer += ch;
        }
        return answer;
    }
}
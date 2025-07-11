class Solution {
    public String solution(String my_string) {
        String answer = "";
        char result;
        for(int i = 0; i < my_string.length(); i++){
            result = my_string.charAt(i);
                if(Character.isUpperCase(result)){
                    answer += Character.toLowerCase(result);
                } else {
                    answer += Character.toUpperCase(result);
                }
        }
        return answer;
    }
}

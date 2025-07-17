class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int result = 0;
        for(int i = 0; i<my_string.length(); i++){
            char num = my_string.charAt(i);
            if(48 <= num && num <= 57){
                result = num - '0';
                answer+=result;
            }
        }
        return answer;
    }
}
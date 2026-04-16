class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(int i = 0; i < rny_string.length(); i++){
            char result = rny_string.charAt(i);
            if(result == 'r' && result == 'n'){
                answer += 'm';
            }else if(result == 'm'){
                answer += 'r';
                answer += 'n';
            }else{
                answer += result;
            }
        }
        return answer;
    }
}
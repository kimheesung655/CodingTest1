class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] mos = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String m : mos){
            for(int i = 0; i < morse.length; i++){
                if(m.equals(morse[i])){
                    answer += (char)('a' + i);
                    break;
                }
            }
        }
        return answer;
    }
}
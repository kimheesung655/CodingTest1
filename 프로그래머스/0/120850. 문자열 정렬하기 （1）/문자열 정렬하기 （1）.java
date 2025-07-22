import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String intStr = "";
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (48 <= ch && ch <= 57) {
                intStr += ch;

            }
        }
        int[] answer = new int[intStr.length()];
        for(int j = 0; j < intStr.length(); j++){
            answer[j] = intStr.charAt(j) - '0';
        }
        Arrays.sort(answer);
        return answer;
    }
}
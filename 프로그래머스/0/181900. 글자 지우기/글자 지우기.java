import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = new String[my_string.length()];
        for(int i = 0; i < str.length; i++){
            char ch = my_string.charAt(i);
            str[i] = String.valueOf(ch);
        }
        int index = 0;
        Arrays.sort(indices);
        for(int i = 0; i < str.length; i++){
            if(index < indices.length && i == indices[index]){
                index++;
            }else{
                answer += str[i];
            }
        }
        return answer;
    }
}
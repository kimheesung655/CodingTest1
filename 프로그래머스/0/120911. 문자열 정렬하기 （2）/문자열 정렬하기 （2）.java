import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.toLowerCase();
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
}
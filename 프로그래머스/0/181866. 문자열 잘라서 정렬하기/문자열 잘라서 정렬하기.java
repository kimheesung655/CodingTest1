import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(!arr[i].isEmpty()){
                count++;
            }
        }
        String[] answer = new String[count];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].isEmpty()){
            answer[index] = arr[i];
            index++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}

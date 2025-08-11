import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int array = 0;
        int[] no = new int[]{-1};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                array++;
            }
        }
        if(array == 0){
            return no;
        }
        int[] answer = new int[array];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[idx] = arr[i];
                idx++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
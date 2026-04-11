class Solution {
    public int[] solution(int[] arr) {
        int small = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(small > arr[i]){
                small = arr[i];
            }
        }
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == small){
                continue;
            }
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}
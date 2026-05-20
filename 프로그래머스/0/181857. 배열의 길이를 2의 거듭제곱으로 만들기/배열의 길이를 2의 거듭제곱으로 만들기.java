class Solution {
    public int[] solution(int[] arr) {
        int leng = 1;
        while (leng < arr.length) {
            leng *= 2;
        }
        int[] answer = new int[leng];
        for(int i = 0; i < answer.length; i++){
            if(i+1 > arr.length){
                answer[i] = 0;
            }else{
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
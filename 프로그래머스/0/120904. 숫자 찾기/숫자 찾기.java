class Solution {
    public int solution(int num, int k) {
        int count = 0;
        int temp = num;
        while (temp > 0) {
        count++;
        temp /= 10;
        }
        int[] answer = new int [count];
        int idx = count-1;
        temp = num;
        while (temp > 0) {
        answer[idx] = temp % 10;
        temp /= 10;
        idx--;
        }
        for(int j = 0; j < answer.length; j++){
            if(answer[j]==k){
                return j+1;
            }
        }
        return -1;
    }
}
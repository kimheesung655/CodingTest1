class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for(int i = 0; i < num_list.length; i++){
            for(int j = i; j < n; j++){
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int n) {
        int result = (n + 1) / 2; 
        int[] answer = new int[result];

        int num = 0;
        for (int i = 1; i <= n; i += 2) {
            answer[num++] = i; 
        }

        return answer;
    }
}
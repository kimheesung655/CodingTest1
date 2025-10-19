class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int num = 0; num <= 9; num++) {
            boolean exists = false;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == num) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                answer += num;
            }
        }

        return answer;
    }
}

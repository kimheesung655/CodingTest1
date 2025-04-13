class Solution {
    public int solution(int n) {
        int sum = 0;
        for (int num = 1; num <= n; num++) {
        if (num % 2 == 0) { 
            sum += num;
            }
        }
        return sum;
    }
}

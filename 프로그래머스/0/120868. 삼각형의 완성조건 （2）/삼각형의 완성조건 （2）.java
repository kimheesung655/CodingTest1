class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];

        int min = Math.abs(a - b) + 1;        // x > |a-b|
        int max = a + b - 1;                  // x < a+b

        return max - min + 1;
    }
}
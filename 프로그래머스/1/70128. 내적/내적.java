class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int[] c = new int[a.length];
        for(int i = 0; i < c.length; i++){
            c[i] = a[i] * b[i];
        }
        for(int i = 0; i < c.length; i++){
            answer += c[i];
        }
        return answer;
    }
}
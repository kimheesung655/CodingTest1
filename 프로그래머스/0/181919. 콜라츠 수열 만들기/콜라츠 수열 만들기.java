class Solution {
    public int[] solution(int n) {
        int temp = n;
        int leng = 1; // 자기 자신 포함

        // 길이 계산용 while (temp로만 돌림)
        while (temp != 1) {
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = 3 * temp + 1;
            }
            leng++;
        }

        int[] answer = new int[leng];
        int i = 0;

        // 실제 값 채우기 while (n으로 돌림)
        while (n != 1) {
            answer[i] = n;
            i++;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        answer[i] = 1; // 마지막 1 넣기

        return answer;
    }
}

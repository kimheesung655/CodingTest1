class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int day1 = (date1[0] * 1000) + (date1[1] * 100) + date1[2];
        int day2 = (date2[0] * 1000) + (date2[1] * 100) + date2[2];
        if(day1 < day2){
            return 1;
        }
        return answer;
    }
}
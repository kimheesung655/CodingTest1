class Solution {
    public String solution(int age) {
        String answer = "";
        if (age == 0) return "a";
        while (age != 0) {
            int num = age % 10;
            if (num == 0) {
                answer = "a" + answer;
            } else if (num == 1) {
                answer = "b" + answer;
            } else if (num == 2) {
                answer = "c" + answer;
            } else if (num == 3) {
                answer = "d" + answer;
            } else if (num == 4) {
                answer = "e" + answer;
            } else if (num == 5) {
                answer = "f" + answer;
            } else if (num == 6) {
                answer = "g" + answer;
            } else if (num == 7) {
                answer = "h" + answer;
            } else if (num == 8) {
                answer = "i" + answer;
            } else if (num == 9) {
                answer = "j" + answer;
            }
            age /= 10;
        }        
        return answer;
    }
}
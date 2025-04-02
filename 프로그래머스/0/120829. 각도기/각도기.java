class Solution {
    public int solution(int angle) {
        if (0 < angle && angle < 90) {
            System.out.println("예각");
        } else if (angle == 90) {
            System.out.println("직각");
        } else if (90 < angle && angle < 180) {
            System.out.println("둔각");
        } else if (angle == 180) {
            System.out.println("평각");
        }
        int answer = 0;
                if (0 < angle && angle < 90) {
            answer = 1;  
        } else if (angle == 90) {
            answer = 2;  
        } else if (90 < angle && angle < 180) {
            answer = 3;  
        } else if (angle == 180) {
            answer = 4;  
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            int last = numbers[numbers.length - 1];
            answer[0] = last;
            for(int i = 0; i < numbers.length - 1; i++){
                answer[i + 1] = numbers[i];
            }
        }else{
            int first = numbers[0];
            answer[numbers.length - 1] = first;
            for(int i = 1; i < numbers.length; i++){
                answer[i - 1] = numbers[i];
            }
        }
        return answer;
    }
}
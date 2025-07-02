class Solution {
    public int solution(int[] numbers) {
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(num1<numbers[i]){
                num2 = num1;
                num1=numbers[i];
            }
            else if(num2<numbers[i]){
                num2=numbers[i];
            }
        }
        return num1*num2;
    }
}
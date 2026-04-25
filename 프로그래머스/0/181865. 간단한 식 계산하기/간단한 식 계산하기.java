class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] nums = binomial.split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[2]);
        if(nums[1].equals("+")){
            answer = a + b;
        }else if(nums[1].equals("-")){
            answer = a - b;
        }else if(nums[1].equals("*")){
            answer = a * b;
        }else{
            answer = a % b;
        }
        return answer;
    }
}
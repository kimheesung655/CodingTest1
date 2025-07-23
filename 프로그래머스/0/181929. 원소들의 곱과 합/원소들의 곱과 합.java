class Solution {
    public int solution(int[] num_list) {
        int sum = 1;
        int mul = 0;
        for(int i = 0; i < num_list.length; i++){
            sum*=num_list[i];
            mul+=num_list[i];
        }
        mul*=mul;
        if(sum < mul)
            return 1;
        else
            return 0;
    }
}
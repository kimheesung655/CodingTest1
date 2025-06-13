class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[2];
        int i = 0;
        while (i < num_list.length) {
            if (num_list[i] % 2 == 0) result[0]++;
            else result[1]++;
            i++;
        }
        return result;
    }
}
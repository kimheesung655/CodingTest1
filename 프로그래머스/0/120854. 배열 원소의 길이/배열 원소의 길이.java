class Solution {
    public int[] solution(String[] strlist) {
        int sum = 0;
        int[] result = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) { 
            for(int j = 0; j < strlist[i].length(); j++){
                sum = j+1;
            }
                result[i] = sum;
            }
                
        return result;
    }
}
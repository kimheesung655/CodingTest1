class Solution {
    public int solution(String myString, String pat) {
        String result = myString.replace("A", "X");
        result = result.replace("B", "A");
        result = result.replace("X", "B");
        if(result.contains(pat)){
            return 1;
        }else{
            return 0;
        }
    }
}
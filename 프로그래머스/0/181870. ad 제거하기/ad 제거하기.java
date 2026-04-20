class Solution {
    public String[] solution(String[] strArr) {
        int arr = 0;
        for(int i = 0; i < strArr.length; i++){
            if(!(strArr[i].contains("ad"))){
                arr++;
            }
        }
        String[] answer = new String[arr];
        int index = 0;
        for(int i = 0; i < strArr.length; i++){
            if(!(strArr[i].contains("ad"))){
                answer[index] = strArr[i];
                index++;
            }
        }
        return answer;
    }
}
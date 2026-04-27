class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int leng = 0;
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false){
                leng++;
            }
        }
        String[] answer = new String[leng];
        int index = 0;
        for(int i = 0; i < todo_list.length; i++){
            if(finished[i] == false){
                answer[index] = todo_list[i];
                index++;
            }
        }
        return answer;
    }
}
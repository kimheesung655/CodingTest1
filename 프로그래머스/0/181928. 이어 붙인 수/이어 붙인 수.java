class Solution {
    public int solution(int[] num_list) {
        String hol = "";
        String jjak = "";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 != 0){
                hol += Integer.toString(num_list[i]);
            }else{
                jjak += Integer.toString(num_list[i]);
            }
        }
        int HOL = Integer.parseInt(hol);
        int JJAK = Integer.parseInt(jjak);
        
        return HOL+JJAK;
    }
}
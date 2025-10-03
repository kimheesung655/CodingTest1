class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        String ab = A+B;
        String ba = B+A;
        int aa = Integer.parseInt(ab);
        int bb = Integer.parseInt(ba);
        if(aa > bb){
            return aa;
        }else{
            return bb;
        }
    }
}
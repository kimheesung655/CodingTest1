class Solution {
    public boolean solution(int x) {
        int cnt = 0;
        int X = x;
        while (x > 0){
            cnt += x % 10;
            x /= 10;
        }
        if(X % cnt == 0){
            return true;
        }else{
            return false;
        }
    }
}
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int n = (numer1 * denom2) + (numer2 * denom1);
        int d = denom1 * denom2;
        
        int gcd = getGCD(n, d);
        
        return new int[]{n / gcd, d / gcd};
    }
    private int getGCD(int a, int b){
        if(b == 0) return a;
        return getGCD(b, a%b);
    }
}
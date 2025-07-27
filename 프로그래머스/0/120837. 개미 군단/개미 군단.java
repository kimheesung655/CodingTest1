class Solution {
    public int solution(int hp) {
        int wkd = hp / 5;
        int tk = hp % 5;
        int qud = tk / 3;
        tk = tk % 3;
        int dlf = tk;
        return wkd + qud + dlf;
    }
}
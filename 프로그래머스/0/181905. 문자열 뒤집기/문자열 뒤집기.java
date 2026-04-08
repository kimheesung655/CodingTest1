class Solution {
    public String solution(String my_string, int s, int e) {
        String str1 = my_string.substring(0, s);
        String str2 = my_string.substring(e+1, my_string.length());
        String str3 = my_string.substring(s, e+1);
        String reverse = new StringBuilder(str3).reverse().toString();
        return str1 + reverse + str2;
    }
}
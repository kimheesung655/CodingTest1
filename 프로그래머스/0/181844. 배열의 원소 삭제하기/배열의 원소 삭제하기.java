import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> del = new ArrayList<>();
        for (int d : delete_list) {
            del.add(d);
        }   
        for(int i = 0; i < arr.length; i++){
            if (!del.contains(arr[i])) {
                list.add(arr[i]);  
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
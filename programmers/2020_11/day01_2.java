import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int getNum : arr) {
            if (list.size() != 0) {
                int lastNum = list.get(list.size()-1);
                if (getNum != lastNum) {
                    list.add(getNum);
                }
            } else {
                list.add(getNum);
            }
        }
        answer = new int[list.size()];
        int idx = 0;
        for (int result : list) {
            answer[idx] = result;
            idx++;
        }
        return answer;
    }
}

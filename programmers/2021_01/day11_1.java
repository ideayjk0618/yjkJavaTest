import java.util.ArrayList;
import java.util.Collections;

class Solution {
    
    private static String SPACE = " ";
    
    public String solution(String s) {
        String answer = "";
        
        ArrayList<Integer> sList = new ArrayList<>();
        
        for (String sStr : s.split(SPACE)) {
        	sList.add(Integer.parseInt(sStr));
        }
        
        int max = Collections.max(sList);
        int min = Collections.min(sList);
        
        answer = min + SPACE + max;
        
        return answer;
    }
}

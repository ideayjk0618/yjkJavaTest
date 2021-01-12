import java.util.ArrayList;
import java.util.Collections;

class Solution {
    
    // 공백 (스페이스바)
    private static String SPACE = " ";
    
    public String solution(String s) {
        String answer = "";
        // List 생성 (숫자)
        ArrayList<Integer> sList = new ArrayList<>();
        // 반복문: 공백기준으로 문자열을 잘라서, 숫자로 캐스팅 후 List에 추가
        for (String sStr : s.split(SPACE)) {
        	sList.add(Integer.parseInt(sStr));
        }
        // Collections을 이용한 최댓값과 최솟값 찾기
        int max = Collections.max(sList);
        int min = Collections.min(sList);
        
        answer = min + SPACE + max;
        
        return answer;
    }
}

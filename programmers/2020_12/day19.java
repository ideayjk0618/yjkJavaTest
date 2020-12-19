import java.util.HashMap;

class Solution {
    
    // 고정문자열
    private String STR_Y = "y";
    private String STR_P = "p";
    
    boolean solution(String s) {
        boolean answer = true;
        
        // 모든 문자열 소문자 -> 배열화
        String[] sArr = s.toLowerCase().split("");
        // 해시맵 생성
        HashMap<String, Integer> hm = new HashMap<>();
        // y와 p를 key로 각 값을 0으로 설정
        hm.put(STR_Y, 0);
        hm.put(STR_P, 0);
        
        // 반복문: 해당 key인경우 값을 +1로 업데이트
        for (String sStr : sArr) {
            if (hm.containsKey(sStr)) {
                int getCon = hm.get(sStr);
                hm.put(sStr, getCon + 1);
            }
        }
        // p와 y의 값
        int getP = hm.get(STR_P);
        int getY = hm.get(STR_Y);

        // p,y모두 하나도 없는 경우 : true
        if (0 == getP && 0 == getY) {
            answer = true;
        } else if (getP != getY) {
            // 개수를 비교할때 다른 경우: false
            answer = false;
        } else {
            // 개수가 같은경우 : true
            answer = true;
        }
        
        return answer;
    }
}

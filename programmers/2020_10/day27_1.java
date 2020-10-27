import java.util.*;

class Solution {
   
    /**
     *  @param  점수|보너스|[옵션]으로 이루어진 문자열 3세트.
     *                  1. 점수 : 0 ~ 10
     *                  2. 보너스 S^1, D^2, T^3
     *                  3. 옵션 *^2, #*-1, ' '(없음)
     *
     *  @return 총점수를 반환
    */
    public int solution(String dartResult) {
        int answer = 0;
        
        // 문자열 길이
        int dartResLen = dartResult.length();
        

        // 숫자 저장용 List
        ArrayList<Integer> calList = new ArrayList<>();
        int idx = -1;

        for (int i = 0; i < dartResLen; i++) {
            // 해당 위치의 문자열 출력
            char charDart = dartResult.charAt(i);
            // 점수인 경우(=숫자인 경우)
            if (Character.isDigit(charDart)) {
                // 연속 숫자인 경우 (숫자가 10인경우)
                if (i != 0 && Character.isDigit(dartResult.charAt(i-1))) {
                    calList.set(idx, 10);
                } else {
                    // char를 int로 형변환 하여 List에 추가한다.
                    calList.add(Character.getNumericValue(charDart));
                    idx++;
                }
            } else {
                // 보너스 및 옵션인 경우 (=숫자가 아닌 경우)
                int getPoint = calList.get(idx);

                switch (String.valueOf(charDart)) {
                    case "S" :
                        calList.set(idx, (int) Math.pow(getPoint, 1));
                        break;
                    case "D" :
                        calList.set(idx, (int) Math.pow(getPoint, 2));
                        break;
                    case "T" :
                        calList.set(idx, (int) Math.pow(getPoint, 3));
                        break;
                    case "*" :
                        if (idx != 0) {
                            int getBefPoint = calList.get(idx-1);
                            calList.set(idx-1, getBefPoint * 2);
                        }
                        calList.set(idx, getPoint * 2);
                        break;
                    case "#" :
                        calList.set(idx, getPoint * (-1));
                        break;
                }
            }
        }

        for (int resultPoint : calList) {
            answer += resultPoint;
        }
        return answer;
    }
}

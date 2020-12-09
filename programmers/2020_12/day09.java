import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 중요 키포인트 : completion의 길이는 participant의 길이보다 1 작습니다.
        // 배열 생성
        ArrayList<String> list = new ArrayList<>();
        // 오름차순 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        // 반복문1: List에 참가자를 추가한다.
        for (String part : participant) {
            list.add(part);
        }
        // 반복문2: 같으면 해당 위치를 0로 치환
        for (int i = 0; i < completion.length; i++) {
            String getP = list.get(i);
            String getC = completion[i];
            if (getP.equals(getC)) {
                list.set(i, "0");
            }
        }
        // 0이 아닌 선수가 결과
        for (String result : list) {
            if (!("0".equals(result))) {
                answer = result;
            }
        }

        return answer;
    }
}

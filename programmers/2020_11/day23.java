import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        // 정렬(오름차순)
        Arrays.sort(citations);
        // h번 인용한 논문을 담을 배열생성
        ArrayList<Integer> arrCit = new ArrayList<>();
        // 내림차순 정렬을 하기 위해 반복문 사용
        for (int j = citations.length-1; j >= 0; j--) {
            arrCit.add(citations[j]);
        }
        
        // 논문의 수(No.)를 세기 위해 i는 1부터 시작한다. (보통의 숫자셈은 1부터 시작하기 때문에)
        for (int i = 1; i <= arrCit.size(); i++) {
            // 배열의 인덱스는 0부터 시작하기때문에 -1를 해준다.
            int idx = i - 1;
            // 내림차순으로 한 배열에서 큰수부터 가져온다.
            int getCit = arrCit.get(idx);
            // i의 논문의 수(No.)와 h번 인용한 수(getCit)를 비교해서 같으면 해당 i번째가 나의 h가 된다.
            if (i == getCit) {
                answer = i;
                break;
            } else if (i > getCit) {
                // i번째가 작아지는 순간의 직전이 나의 h가 된다.
                answer = idx;
                break;
            } else if (i == arrCit.size()) {
                // 위의 조건을 만족하지 못해서 반복문에서 탈출하지 못한 경우 맨마지막의 i가 나의 h가 된다.
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}

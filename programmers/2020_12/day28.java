import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        // 목표 : 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순
        
        // 제한사항 2<=numbers길이<=100
        if (2 > numbers.length || 100 < numbers.length) {
            return answer;
        }
        
        // 배열 생성
        ArrayList<Integer> numList = new ArrayList<>();
        // 인덱스
        int idx = 0;
        // 반복문1: numbers배열-> 출력
        for (int number : numbers) {
            // 제한사항 0<= numbers값 <= 100
            if (0 > number || 100 < number) {
                return answer;
            }
            // 반복문2: numbers배열 -> 출력
            for (int i = 0; i < numbers.length; i++) {
                // 인덱스와 i와 값 비교 (서로 다른 인덱스)
                if (idx != i) {
                    // 더한값
                    int sum = number + numbers[i];
                    // 배열이 0이 아닌경우
                    if (0 != numList.size()) {
                        if (!(numList.contains(sum))) {
                            numList.add(sum);
                        }
                    } else {
                        // 배열이 0인 경우
                        numList.add(sum);
                    }
                }
            }
            // 인덱스 +1
            idx++;
        }
        // List 오름차순 정렬
        Collections.sort(numList);
        // answer에 추가
        answer = new int[numList.size()];
        for (int j = 0; j < numList.size(); j++) {
            answer[j] = numList.get(j);
        }
        
        return answer;
    }
}

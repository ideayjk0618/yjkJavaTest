import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        // 실패율 = 도달했으나 클리어 못한 수 / 스테이지에 도달한 수
        
        // 마지막 스테이지
        int lastN = N + 1;
        
        // 도전한 사용자
        int user = stages.length;
        
        // 정렬
        Arrays.sort(stages);
        // 스테이지 번호, 도전자 수
        HashMap<Integer, Integer> stageMap = new HashMap<>();
        
        for (int stage : stages) {
            // 스테이지 번호가 있으면, 도전자 수를 +1 한다
            if (stageMap.containsKey(stage)) {
                int userCount = stageMap.get(stage);
                stageMap.put(stage, userCount + 1);
            } else {
                // 스테이지 번호가 없으면, 도전자 수를 1로 설정한다
                stageMap.put(stage, 1);
            }
        }
        // 스테이지 번호, 실패율
        HashMap<Integer, Double> failMap = new HashMap<>();
        for (int i = 1; i < lastN; i++) {
            if (stageMap.containsKey(i)) {
                int stageUser = stageMap.get(i);
                // 형변환을 해야 계산이 가능하다
                double fail = (double)stageUser / (double)user;
                failMap.put(i, fail);
                user = user - stageUser;
            } else {
                failMap.put(i, 0.0);
            }
        }
        
        // 실패율 정렬 (Map.Entry) -> Map의 Value를 정렬하는 방법
        ArrayList<Entry<Integer, Double>> resultList = new ArrayList<>(failMap.entrySet());
        Collections.sort(resultList, new Comparator<Entry<Integer, Double>>() {
            // compare로 값을 비교
            public int compare(Entry<Integer, Double> obj1, Entry<Integer, Double> obj2)
            {
                // 내림 차순으로 정렬
                return obj2.getValue().compareTo(obj1.getValue());
            }
        } );
        
        // 결과출력
        int idx = 0;
        for(Entry<Integer, Double> entry : resultList) {
          answer[idx] = entry.getKey();
                idx++;
        }
        
        return answer;
    }
}

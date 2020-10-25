import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    /**
     *   @param  N   전체 스테이지의 개수
     *   @param  stages  게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열
     *
     *   @return 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열
     *                  (같은 실패율 : 오름차순, 스테이지에 도달한 유저가 없는 경우 : 0)
    */
    public int[] solution(int N, int[] stages) {     
        int[] answer = new int[N];
        
        // 제한사항
        if (N < 1 || N > 500) {
            return answer;
        } else {
            // 도전한 사용자 수
            int userLen = stages.length;
            // 도전자들의 스테이지상태를 오름차순정렬
            Arrays.sort(stages);
            // 스테이지
            HashMap<Integer, Integer> stageMap = new HashMap<>();
            // 실패율
            HashMap<Integer, Double> failMap = new HashMap<>();
            
            // 스테이지의 개수만큼 HashMap에 추가.
            for (int i = 1; i <= N; i++) {
                stageMap.put(i, 0);
            }

            // 각 스테이지에 유저가 얼마나 있는지 체크한다.
            for (int j = 0; j < userLen; j++) {
                if (stages[j] < 1 || stages[j] > N +1) {
                    return answer;
                } else if (stageMap.containsKey(stages[j])) {
                    int countUser = stageMap.get(stages[j]);
                    countUser++;
                    stageMap.put(stages[j], countUser);
                }
            }
            
            // 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
            for (int z = 1; z <= N; z++) {
                double getUserCon = (double) stageMap.get(z);  // z스테이지의 플레이어의 수
                if (getUserCon != 0) {
                    double failPer = getUserCon / userLen; // 실패율
                    failMap.put(z, failPer); // 해당 스테이지에 실패율 추가
                    userLen = userLen - (int) getUserCon; // 도전한 사용자 수
                } else {
                    failMap.put(z, getUserCon);
                }
            }
            // 실패율 정렬 (Map.Entry) -> Map의 Value를 정렬하는 방법은 구선생이 알려주심.ㄳ
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
        }
        return answer;
    }
}

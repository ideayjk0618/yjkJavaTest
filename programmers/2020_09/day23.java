import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    
    // 고정 배열
    // 수포자1
    private int[] MATH_1 = {1, 2, 3, 4 ,5};
    // 수포자2
    private int[] MATH_2 = {2, 1, 2, 3, 2, 4, 2, 5};
    // 수포자3
    private int[] MATH_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int math1_con = 0; // 수포자1의 맞춘갯수   
        int math2_con = 0; // 수포자2의 맞춘갯수    
        int math3_con = 0; // 수포자3의 맞춘갯수
        
        // 에러처리 (10,000문제)
        if (answers.length > 10000) {
            return answer;
        } else {
            // 에러처리 (정답은 1~5)
            for (int ans : answers) {
                if (ans < 1 || ans > 5) {
                    return answer;
                }
            }
            
            int idx1 = 0; // 수포자1의 배열인덱스
            int idx2 = 0; // 수포자2의 배열인덱스
            int idx3 = 0; // 수포자3의 배열인덱스
            
            for (int i = 0; i < answers.length; i++) {
                // 각 배열씩 하나씩 비교, 서로 같으면 맞은 갯수 +1을 한다.
                if (answers[i] == MATH_1[idx1]) {
                    math1_con++;
                }
                if (answers[i] == MATH_2[idx2]) {
                    math2_con++;
                }
                if (answers[i] == MATH_3[idx3]) {
                    math3_con++;
                }
                idx1++;
                idx2++;
                idx3++;
                // 각 수포자들의 인덱스가 마지막이라면, 다시 0으로 초기화 시킨다.
                if (idx1 == MATH_1.length) {idx1 = 0;}
                if (idx2 == MATH_2.length) {idx2 = 0;}
                if (idx3 == MATH_3.length) {idx3 = 0;}
            }
            // key:수포자, value:맞춘갯수 를 Map에 추가한다.
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            map.put(1, math1_con); // 수포자1
            map.put(2, math2_con); // 수포자2
            map.put(3, math3_con); // 수포자3
            
            // map의 value(맞춘갯수)중에 제일 큰 수를 찾는다.
            int max = (Collections.max(map.values()));
            
            ArrayList<Integer> getKeyList = new ArrayList<Integer>();
            // value로 key를 찾는 메소드를 사용한다.
            getKeyList = getKey(map, max);
            
            answer = new int [getKeyList.size()]; // answer를 선언
            int idx0 = 0;
            for (int keyNum : getKeyList) {
                answer[idx0++] = keyNum;
            }
            // 오름차순으로 정렬한다.
            Arrays.sort(answer);
        }
        return answer;
    }
    
        // Map에서 value로 key값 찾기
        public static ArrayList getKey(Map<Integer, Integer> map, int value) {
            ArrayList <Integer> list = new ArrayList<Integer>();
            for (int key : map.keySet()) {
                if (value == map.get(key)) {
                    list.add(key);
                }
            }
        return list;
        }
}

import java.util.TreeMap;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 트리맵은 key를 기준으로 오름차순으로 자동 정렬한다
        // 그래서 HashMap에 비하면 조금 효율성이 떨어짐
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        
        // 분실한 학생들
        for (int l : lost) {
            treeMap.put(l, 0);
        }
        // 여벌있는 학생들
        for (int res : reserve) {
            // 여벌학생이 분실
            if (treeMap.containsKey(res)) {
                treeMap.put(res, 1);
            } else {
               treeMap.put(res, 2); 
            }
        }
        // 나머지 학생들
        for (int i = 1; i <= n; i++) {
            if (!(treeMap.containsKey(i))) {
                treeMap.put(i, 1);
            }
        }
        
        for (int j = 0; j < treeMap.size(); j++) {
            int student = treeMap.get(j);
            
            if ()
            
            if (0 == student) {
                // switch에서 case쓸때 final(절대값)만을 사용할수있다.
                // 아니면 'constant expression required'라는 에러 발생
                switch (j) {
                    case 1 :
                        int nextStudent = treeMap.get(2);
                        if (nextStudent > 1) {
                            treeMap.put(1, 1);
                            treeMap.put(2, 1);
                        }
                        break;
                    case INT_N :
                        int beforeStudent = treeMap.get(INT_N-1);
                        if (beforeStudent > 1) {
                            treeMap.put(INT_N, 1);
                            treeMap.put(INT_N-1, 1);
                        }
                        break;
                    default :
                        int nextStudent2 = treeMap.get(j+1);
                        int beforeStudent2 = treeMap.get(j-1);
                        if (nextStudent2 > 1) {
                            treeMap.put(j, 1);
                            treeMap.put(j+1, 1);
                        } else if (beforeStudent2 > 1) {
                            treeMap.put(j, 1);
                            treeMap.put(j-1, 1);
                        }
                        break;
                }
            }
        }
        System.out.print(treeMap);
        
        return answer;
    }
}

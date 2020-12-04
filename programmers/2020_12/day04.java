import java.util.TreeMap;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        final int INT_N = n - 1;
        
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
        
        for (int j = 1; j <= treeMap.size(); j++) {
            int student = treeMap.get(j);
            if (1 == j) {
                if (0 == student) {
                    int nextStudent = treeMap.get(j+1);
                    if (1 < nextStudent) {
                        treeMap.put(j, 1);
                        treeMap.put(j+1, 1);
                    }
                }
            } else if (n == j) {
                if (0 == student) {
                    int beforeStudent = treeMap.get(n);
                    if (1 < beforeStudent) {
                        treeMap.put(n, 1);
                        treeMap.put(n-1, 1);
                    }
                }
            } else {
                if (0 == student) {
                    int nextStudent2 = treeMap.get(j+1);
                    int beforeStudent2 = treeMap.get(j-1);
                    if (nextStudent2 > 1) {
                        treeMap.put(j, 1);
                        treeMap.put(j+1, 1);
                    } else if (beforeStudent2 > 1) {
                        treeMap.put(j, 1);
                        treeMap.put(j-1, 1);
                    }
                }
            }
        }
        int count = 0;
        for (int z = 1; z <= treeMap.size(); z++) {
            int getResult = treeMap.get(z);
            if (0 == getResult) {
                count++;
            }
        }
        
        answer = n - count;
        
        return answer;
    }
}

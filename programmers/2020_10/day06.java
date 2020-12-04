import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 예외처리
        if (n < 2 || n > 30) {
            return answer;
        } else if (reserve.length < 1 || reserve.length > n) {
            return answer;
        } else if (lost.length < 1 || lost.length > n) {
            return answer;
        } else {
            HashMap<Integer, Integer> hmLost = new HashMap<Integer, Integer>();
            for (int lo : lost) {
                hmLost.put(lo, lo);
            }
            for (int i = 0; i < reserve.length; i++) {
                // 여벌의 학생이, 자기꺼 잃어버렸는지 체크해서 여러벌중 자끼거 잃어버렸으면 0으로 치환. = 중복제거
                if (hmLost.containsValue(reserve[i])) {
                    hmLost.put(reserve[i], 0);
                    reserve[i] = 0;
                }
            }
            
            // 중복제거된 각 리스트끼리 앞뒤체크.
            for (int res : reserve) {
                if (res != 0) {
                    int resChk1 = res - 1; // 앞의 값
                    int resChk2 = res + 1; // 뒤의 값
                    if (hmLost.containsValue(resChk1)) {
                        hmLost.put(resChk1, 0);
                    } else if (hmLost.containsValue(resChk2)) {
                        hmLost.put(resChk2, 0);
                    }
                }
            }
            // 옷 못빌린애들 (0으로 치환 되지 못한 애들) 체크
            int result = 0;
            for (Entry<Integer, Integer> elem : hmLost.entrySet()) {
                if (elem.getValue() != 0) {
                    result++;
                }
            }
            answer = n - result;
        }
        return answer;
    }
}
// 효율성이 하나도 없는 코딩임.

import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        // 배열 생성 配列を生成
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if (arr.length < 1) {
            return answer;
        } else {
            for (int arrNum : arr) {
                // 나머지값이 0인가 체크　剰余が０のかを確認
               if (arrNum % divisor == 0) {
                   list.add(arrNum);
               } 
            }
            // 만약 나누어지는 수가 없으면 -1를 반환　剰余が０ではない場合、－１を返却
            if (list.size() < 1) {
                answer = new int[]{-1};
            } else {
                 answer = new int[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    answer[i] = list.get(i);; 
                }
                // 오름차순으로 정렬　昇順にソートする
                Arrays.sort(answer);
            }
        }
        return answer;
    }
}

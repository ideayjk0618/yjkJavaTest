import java.util.LinkedHashSet;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        // 에러처리 エラー処理
        if (arr.length < 1) {
            return answer;
        }
        
        // arr 크기　Arrのサイズ
        int arrNum = arr.length-1;
        
        // arrのサイズが０の場合、-1に返却
        if(arrNum == 0){
            answer = new int[] {-1};
        } else {
            // arr의 값을 중복값을 없애기 위해 linkedHashSet을 이용한다.
            //重複数字を削除するため、LinkedHashSetを使う
            LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
            
            for(int i = 0; i < arr.length; i++) {
                linkedHashSet.add(arr[i]);
            }
            // 배열의 최소값 찾기　最小数字を探す
            int minNum = (Collections.min(linkedHashSet));
            // LinkedHashSet 크기　LinkedHashSetサイズ
            arrNum = linkedHashSet.size() -1;
            // answer 선언　answer生成
            answer = new int[arrNum];
            
            int answNum = 0;
            for(int getNum : linkedHashSet) {
                // 최소값과 같지 않으면 answer에 넣기.
                //　最小数字と違うとanswerに追加
                if (!(minNum == getNum)) {
                    answer[answNum] = getNum;
                answNum++;
                }
            }
        }
        return answer;
    }
}
//양심 고백 : 계속 틀리다고해서 힌트 봤는데, 정렬순이 아니었다..

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        // 配列生成 배열생성
        ArrayList<Integer> list = new ArrayList<Integer>();
        
       for(int i = 0; i < arr.length-1; i++) {
           //前後が違う数字の場合、前の数字を配列に追加する。 앞뒤의 숫자가 다르면, 앞의 숫자를 배열에 추가한다.
           if (!(arr[i] == arr[i+1])) {
               list.add(arr[i]);
           }
           //最後の数字は配列に追加する。 마지막숫자인경우에는 배열에 추가한다.
           if (i+1 == arr.length-1) {
               list.add(arr[i+1]);
           }
       }
        //結果の配列を宣言する。answer의 사이즈를 정의한다.
        answer = new int [list.size()];
        // 
        int idx = 0;
        //データを入れる。 list의 값을 answer에 넣는다. 
        for(int num : list) {
            answer[idx] = num;
            idx++;
        }
        return answer;
    }
}

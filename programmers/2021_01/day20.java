import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        //　List生成
        ArrayList<Integer> list = new ArrayList<>();
        //　繰り返し処理：数字を出力
        for (int arrNum : arr) {
            int listLen = list.size();
            if (0 < listLen) {
                //　最後の数字を出力
                int getNum = list.get(listLen - 1);
                //　同じ数字ではない場合、Listに追加
                if (arrNum != getNum) {
                    list.add(arrNum);
                }
            } else {
                //　Listのサイズが０の場合、Listに追加
                list.add(arrNum);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

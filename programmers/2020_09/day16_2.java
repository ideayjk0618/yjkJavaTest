import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};       
        
        // 重複数字を外すようにSetを利用する。
        HashSet<Integer> hs = new HashSet<Integer>();
        
        //　エラー処理
        for (int i : numbers) {
            if (i < 0 || i > 100) {
                return answer;
            }
        }
        if (numbers.length < 2) {
            return answer;
        } else if (numbers.length > 100) {
            return answer;
        }
        
        //基本値
        int i = 0;
        //次の値
        int j = 0;
        
        //　配列を1つを選択する。
        for (j = 0; j < numbers.length-1; j++) {
            //計算する次の配列を選択する。
           for (i = j+1; i < numbers.length; i++) {
               // 選択する配列の値＋次の配列の値
               int sum = numbers[j] + numbers[i];
               //HashSetに追加する。
               hs.add(sum);
               }
            //選択する配列が０がないの場合
            if(j > 0) {
                //０からJ以前まで計算
               for(int x = 0; x < j; x++) {
                   int sum2 = numbers[j] + numbers[x];
                   hs.add(sum2);
                   
               }
            }
        }
        //HashSetのサイズ
        int shSize = hs.size();
        //結果配列の宣言
        answer = new int[shSize];
        int z = 0;
        for(int getNum : hs) {
            answer[z] = getNum;
            z++;
        }
        //昇順
        Arrays.sort(answer);
        return answer;
    }
}

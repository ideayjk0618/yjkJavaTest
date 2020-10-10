import java.util.ArrayList;
import java.util.Collections;

class Solution {
    
    // 0번째 열 ０番列
    private int ZERO = 0;
    // 1번째 열　１番列
    private int ONE = 1;
    // 2번째 열　２番列
    private int TWO = 2;
    
    public int[] solution(int[] array, int[][] commands) {
        int intSize = commands.length;
        int[] answer = new int[intSize];
        
        // 에러처리 エラー処理
        if (array.length < 1) {
            return answer;
        } else if (array.length > 100) {
            return answer;
        }
        if (commands.length < 1) {
            return answer;
        } else if (commands.length > 50) {
            return answer;
        }
        
        // 원소 길이가 3이 아닌것은 에러　元素の長さが３以上の場合エラー
        for (int k = 0; k < commands.length; k++) {
            if (commands[k].length == 3) {
                return answer;
            }
        }
       
        for (int i = 0; i < commands.length; i++) {
            //　i値
            int startPoint = commands[i][ZERO];
            //　j値
            int endPoint = commands[i][ONE];
            //　k値
            int getPoint = commands[i][TWO];

            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int j = startPoint-1; j <= endPoint-1; j++) {
                arr.add(array[j]);
            }
            // 오름차순 정렬　昇順
            Collections.sort(arr);
            
            answer[i] = arr.get(getPoint-1);
        }
        
        return answer;
    }
}

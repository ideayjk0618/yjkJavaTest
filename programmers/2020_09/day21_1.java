import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // エラー処理
        if(s.length() < 1) {
           return answer;
        } else {
            //文字列Sのサイズ
            int sLen = s.length();
            //ソートするための配列を生成する。
            String[] arr = new String[sLen];
            
            for (int i =0; i < sLen; i++) {
                //配列に追加する。
                arr[i] = s.substring(i, i+1);
            }
            //ソートする。
            Arrays.sort(arr);

            for (String str : arr) {
              answer = str + answer; 
            }
        }
        
        return answer;
    }
}

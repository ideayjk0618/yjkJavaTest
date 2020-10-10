import java.util.ArrayList;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        
        // エラー処理 에러처리
        if (n < 1 || n > 16) {
            return answer;
        } else if (arr1.length != n || arr2.length != n) {
            return answer;
        }
        ArrayList<String> numList = new ArrayList<String>();
        
        for (int i = 0; i < n; i++) {
            // 数字をバイナリに変換 이진수로 변환
            String arr1Num = Integer.toBinaryString(arr1[i]);
            String arr2Num = Integer.toBinaryString(arr2[i]);
            //　エラー処理 원소의 에러처리
            if (arr1Num.length() < 0 || arr1Num.length() > n) {
                return answer;
            } else if (arr2Num.length() < 0 || arr2Num.length() > n) {
                return answer;
            } else {
                //　バイナリに変換した数字を加算OverflowにならないようにLongタイプを使う。
                // 여기서 2,6번 런타임 에러가 나서 힌트를 보니, int로 설정할경우 오버플로우가 나기 때문에 사이즈가 더 큰 long타입으로 설정하는 것이 좋다.
                long arrSum = Long.parseLong(arr1Num) + Long.parseLong(arr2Num);
                //　文字に変換
                String arrStr = String.valueOf(arrSum);
                //　加算したバイナリサイズがNより小さいの場合、０を文字列前につける。계산한 이진수의 길이가 n보다 작으면, 앞에다 0을 붙여준다.
                if (arrStr.length() < n) {
                    int dis = n - arrStr.length();
                    String zero = "";
                    for (int z = 0; z < dis; z++) {
                        zero += "0";
                    }
                    arrStr = zero + arrStr;
                }
                //２と１は壁なので、＃に変換、０は道で空白に変換する。2와 1인 경우는 벽이기 때문에 #로, 0인경우는 공백으로 치환한다.
                String numStr = arrStr.replace("2", "#").replace("1", "#").replace("0", " ");
                numList.add(numStr); 
            }
            
        }
        //出力
        answer = new String[numList.size()];
        int j = 0;
        for(String numStr : numList) {
            answer[j] = numStr;
            j++;
        }
        return answer;
    }
}

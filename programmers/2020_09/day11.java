public class Solution {
    public int solution(int n) {
        int answer = 0;

        //　Nが100000000以上の場合、サービス終了 N이 100000000보다 큰경우, 서비스종료
        if (n > 100000000) {
            return answer;
        } else if (n < 0) {
            // 음수 인경우, 서비스 종료 アイナス値の場合はサービス終了
            return answer;
        } else {
            // 숫자n을 문자열로 변환数字Nを文字列に変換
            String toStrN = Integer.toString(n);
            //　文字列Nのサイズ n의 사이즈
            int strNsize = toStrN.length();
            
            for (int i = 0; i < strNsize ; i++) {
                // 문자열로 변환한 값을 subString을 이용하여 한자리씩 추출한다.　文字列に変換したN値を、SubStringを利用して1桁のみづつ取得する。
                String getNum = toStrN.substring(i, i+1);
                
                //取得した1桁の文字列を数字に変換する。취득한 문자를 숫자로 바꾼다.
                int toIntN = Integer.valueOf(getNum);
                
                answer = answer + toIntN;
            }
        }

        return answer;
    }
}

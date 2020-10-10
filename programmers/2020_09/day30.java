class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // 同じ数字なら、aとかbをリーたんする。
        if (a == b) {
            return answer = a;
        } else if (a < -10000000 || a > 10000000) {
            //　aのサイズチェック
            return answer;
        } else if (b < -10000000 || b > 10000000) {
            //　bのサイズチェック
            return answer;
        } else {
            // aは必ず小さい数字に設定するため、aとbのサイズをチェックする。（bが小さい場合aのサイズに移動する）
            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            //　初期値をa、aからbまで繰り返しにする。
            for (int i = a; i <= b; i++) {
                answer = answer + i;
            }
        }
        return answer;
    }
}

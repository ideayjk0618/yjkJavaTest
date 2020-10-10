class Solution {
    
    // アスタリスク
    private String AST = "*";
    
    public String solution(String phone_number) {
        String answer = "";
        
        // エラー処理
        if(phone_number.length() < 4) {
            return answer;
        } else if (phone_number.length() > 20) {
            return answer;
        }
        
        // 番号を後ろから４桁のみ取得する。
        String backNum = phone_number.substring(phone_number.length()-4, phone_number.length());
        
        //　全体ー下から４桁＝アスタリスク部分
        int starCodeSize = phone_number.length() - backNum.length();
        for (int i = 0; i < starCodeSize; i++) {
            answer = answer + AST;
        }
        
        //　アスタリスク＋下から４桁
        answer = answer + backNum;
        
        return answer;
    }
}

class Solution {
    
    private String SPACE = " ";
    
    public String solution(String s) {
        String answer = "";
        
        // s文字列を全部少文字に変換する。
        s = s.toLowerCase();

        String[] arrStr = s.split(SPACE);
        int idx = 1;
        
        for (String getStr : arrStr) {
            for (int i = 0; i < getStr.length(); i++) {
                String str = getStr.substring(i, i+1);

                // 偶数の場合大文字に変換（ゼロを含む）する。
                if (i % 2 == 0) {
                    str = str.toUpperCase();
                }           
                answer += str;
            }
            if (idx < arrStr.length) {
                answer += SPACE;
                idx++;
            }
        }
        
        // 문자열의 마지막 공백 확인 (힌트보니까 단어 뒤에도 공백이 있는 경우가 있다고 해서 추가함. 해당 조건을 빠트리면 4,5,8,9,11번 케이스에서 NG됨.)
        if (answer.length() != s.length()) {
            for (int j = answer.length(); j < s.length(); j++) {
                answer += SPACE;
            }
        }
        return answer;
    }
}

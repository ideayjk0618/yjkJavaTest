class Solution {
    
    //고정문자열固定文字列KIM
    private String NAME_KIM = "Kim";
    
    public String solution(String[] seoul) {
        String answer = "";
        // 위치位置
        int index = 0;
        
        // 에러처리エラー処理 0 < seoul < 1001
        if (seoul.length < 0 || seoul.length > 1000) {
            return answer;
        }
        
        for (String getName : seoul) {
            // 에러처리エラー処理  0 < seoul원소 < 21
            if (getName.length() < 0 || getName.length() > 20) {
                return answer;
            } else {
                if (NAME_KIM.equals(getName)) {
                   answer = String.format("김서방은 %d에 있다", index);
                }
                index++;
            }
        }
        return answer;
    }
}

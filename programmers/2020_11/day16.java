class Solution {
    
    // 고정문자열:*
    private String STR_AST = "*";
    
    public String solution(String phone_number) {
        String answer = "";
        // 핸드폰번호 길이
        int phoneLen = phone_number.length();
        // 제한조건
        if (phoneLen < 4 || phoneLen > 20) {
            return answer;
        }
        // *을 출력해야할 수 = 핸드폰번호길이 - 4
        int astLen = phoneLen - 4;
        
        int index = 0; // 인덱스
        while (index < astLen) {
            answer += STR_AST;
            index++;
        }
        // 폰번호를 split을 이용하여 배열로 변경
        String[] phoneArr = phone_number.split("");
        // index를 이용해서 뒷자리 4자리만 출력한다.
        while (index < phoneLen) {
            answer += phoneArr[index];
            index++;
        }
        
        return answer;
    }
}

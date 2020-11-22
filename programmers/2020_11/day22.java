class Solution {
    
    // 고정문자열은 상단에 선언
    private String STR_SU = "수";
    private String STR_PARK = "박";
    
    public String solution(int n) {
        String answer = "";
        
        // 제한조건
        if (n > 10000) {
            return answer;
        } else {
            while (n > 0) {
                // 삼항연산자
                answer = ((n % 2 != 0) ? STR_SU : STR_PARK) + answer;
                n--;
            }
        }
        
        return answer;
    }
}
/**
  삼항연산자 주의사항
  1 코드라인이 줄었다고 컴파일의 속도가 빨라지는것이 아님.
  2 중복으로 사용할경우 가독성이 떨어지므로 피는것이 좋음.
**/

class Solution {
    
    // 고정문자열 Odd
    private String ODD = "Odd";
    // Even
    private String EVEN = "Even";
    
    public String solution(int num) {
        String answer = EVEN;
        
        if (num % 2 != 0) {
            answer = ODD;
        } 
        
        return answer;
    }
}

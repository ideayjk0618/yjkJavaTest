class Solution {
    public boolean solution(String s) {
        
        boolean answer = false;
        
        // 1 < s < 8 문자열의 길이 체크
        if (s.length() < 1 || s.length() > 8) {
            return answer;
        } else if (s.length() == 4 || s.length() == 6) {
            try {
                // 문자열을 숫자로 변경
                Integer.parseInt(s);
                answer = true;
            } catch (Exception e) {
                // 문자열을 숫자로 변경시 에러날때, catch에서 return 
                return answer;
            }
        }
        return answer;
    }
}
// 자꾸 2,5,6,7,12,13 에러가 나서 왜일까 하고 잘 생각해보니, answer의 초기값이 true로 되어있었다. 숫자가 아니면 무조건 false로 반환 하면되기 때문에, 초기값을 변경.

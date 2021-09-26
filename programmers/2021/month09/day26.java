import java.util.HashMap;

class Solution {
    public int solution(String s) {
        int answer = 0;
		try {
			answer = Integer.parseInt(s);
		} catch (Exception e) {
			String[] num = {
			          "zero"
			        , "one"
			        , "two"
			        , "three"
			        , "four"
			        , "five"
			        , "six"
			        , "seven"
			        , "eight"
			        , "nine"
			        };
			for (int j = 0; j < 10; j++) {
				s = s.replaceAll(num[j], String.valueOf(j));
			}
			answer = Integer.parseInt(s);
		}
		return answer;
    }
}

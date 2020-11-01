class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            int charS = (int) s.charAt(i);
            if (charS >=65 && charS <= 90) {
                int resultS1 = charS + n;
                
                if (resultS1 > 90) {
                    resultS1 = 64 + (resultS1 - 90);
                    //System.out.print(resultS1);
                }
                char resultC1 = (char) resultS1;
                answer += String.valueOf(resultC1);
            } else if (charS >= 97 && charS <=122) {
                int resultS2 = charS + n;
                
                if (resultS2 > 122) {
                    resultS2 = 96 + (resultS2 - 122);
                    //System.out.print(resultS2);
                }
                char resultC2 = (char) resultS2;
                answer += String.valueOf(resultC2);
            } else if (charS == 32) {
                charS = 32;
                answer += " ";
            }
            
        }
        
        
        return answer;
    }
}

class Solution {
    
    // 소문자 초기값
    private int abc = 96;
    // 대문자 초기값
    private int XYZ = 64;
    
    public String solution(String s, int n) {
        String answer = "";
                
        //에러처리
        if (s.length() >= 8001) {
            return answer;
        } else if (n <= 0 || n >=26) {
            return answer;
        } else {
            byte[] getBytes = s.getBytes();

            for (byte getByte : getBytes) {
                
                // 아스키코드;  대문자 A~Z : 65~90, 소문자 a~z : 97 ~122
                
                if (getByte <= 64 && getByte != 32) {
                    return answer = "";
                } else if (getByte >= 91 && getByte <= 96) {
                    return answer = "";
                } else if (getByte >= 123) {
                    return answer = "";
                }

                int getStrNum = 0;
                
                if (getByte == 32) {
                    // 공백문자인 경우
                    getStrNum = 32;
                } else if (getByte >= 65 && getByte <= 90) {
                    getStrNum = getByte + n;
                    if (getStrNum > 90) {
                        int dis = getStrNum - 90;
                        getStrNum = XYZ + dis;
                    }
                } else if (getByte >= 97 && getByte <= 122) {
                    getStrNum = getByte + n;
                    if (getStrNum > 122) {
                        int dis = getStrNum - 122;
                        getStrNum = abc + dis;
                    }
                }
                char  toStr =  (char) getStrNum;
                answer = answer + toStr;
            }
        }
        return answer;
    }
}

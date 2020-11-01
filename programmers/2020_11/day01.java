import java.util.ArrayList;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;

        // 제한조건
        if (1000000 < s.length()) {
            return answer;
        } else {
            ArrayList<String> strList = new ArrayList<>();
            
            for (int i = 0; i < s.length(); i++) {
                char getS = s.charAt(i);
                int dec = (int)getS;
                // 소문자 체크용
                if (97 > dec || 122 < dec) {
                    return answer;
                } else {
                    strList.add(String.valueOf(getS));
                }
            }
            for (int j = 0; j < strList.size()-1; j++) {
                String bef = strList.get(j);
                String aft = strList.get(j+1);
                if (bef.equals(aft)) {
                    strList.remove(j);
                    strList.remove(j);
                    j = -1;
                }
            }
            if (strList.size() == 0) {
                answer = 1;
            } else {
                answer = 0;
            }
        }

        return answer;
    }
}

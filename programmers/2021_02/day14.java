import java.util.ArrayList;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // 아스키코드: (:40 ):41
        
        ArrayList<Character> listChar = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            // char문자
            char getS = s.charAt(i);
            
            // ()가 아닌경우 반환한다.
            if (40 > getS || 41 < getS) {
                return answer;
            } else {
                // 첫번째 문자열이 아닌경우 배열에 추가한다.
                if (0 != i) {
                    if (1 > listChar.size()) {
                        listChar.add(getS);
                    } else {
                        char last = listChar.get(listChar.size()-1);
                        // 마지막 값과 비교해서 괄호가 된다면 리스트의 마지막값을 지운다.
                        if (40 == last && 41 == getS) {
                            listChar.remove(listChar.size()-1);
                        } else {
                            listChar.add(getS);
                        }
                    }
                } else {
                    if (41 != getS) {
                        listChar.add(getS);
                    } else {
                        // 첫번째 문자가 ) 인 경우 : false로 반환
                        return answer = false;
                    }
                }
            }
        }

        // 리스트의 길이가 홀수인 경우 : false로 반환
        if (0 != listChar.size() % 2) {
            return answer = false;
        } else {
            for (int j = 0; j < listChar.size()-1; j++) {
                char s1 = listChar.get(j);
                char s2 = listChar.get(j+1);
                // 괄호가 된다면 j, j+1를 리스트에서 지운다.
                if (40 == s1 && 41 == s2) {
                    listChar.remove(j);
                    listChar.remove(j);
                    j = -1;
                }
            }
        }

        // System.out.print(listChar.size());
        if (0 < listChar.size()) {
            answer = false; 
        }
        
        return answer;
    }
}

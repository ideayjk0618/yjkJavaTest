import java.util.ArrayList;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 소문자화 AZ대문자65~90
        String id = new_id;
        // 초기화
        new_id = "";
        for (int y = 0; y < id.length(); y++) {
            char lowerId = id.charAt(y);
            String lower = String.valueOf(lowerId);
            // 대문자인경우: 소문자로 변경
            if (65 <= lowerId && 90 >= lowerId) {
                new_id += lower.toLowerCase();
            } else {
                new_id += lower;
            }
        }
        // You cannot create an ArrayList of primitive types like int , char etc.
        // You need to use boxed types like Integer , Character , Boolean etc.
        ArrayList<Character> charId = new ArrayList<>();
        
        // -빼기45, _밑줄95, .마침표46, az소문자97~122, 09숫자48~57
        for (int i = 0; i < new_id.length(); i++) {
            char getChar = new_id.charAt(i);
            
            if (97 <= getChar && 122 >= getChar) { // 소문자
                charId.add(getChar);
            } else if (46 == getChar) { // 마침표
                // list 크기가 0보다 큰경우: 마지막이 .가 아닌경우 list에 추가
                if (0 < charId.size()) {
                    if (charId.get(charId.size()-1) != getChar) {
                        charId.add(getChar);
                    }
                }
            } else if (48 <= getChar && 57 >= getChar) { // 숫자
                charId.add(getChar);
            } else if (45 == getChar || 95 == getChar) { // 빼기, 밑줄
                charId.add(getChar);
            } else if (32 == getChar) { // 빈문자열
                // 빈 문자열이라면, a를 대입
                charId.add('a');
            }
            // 길이는 최대 15문자까지 허용
            if (15 == charId.size()) {
                break;
            }
        }

        // list가 0보다 크면: 마지막 문자열이 .인지 확인하여 .인경우 삭제한다
        if (1 <= charId.size()) {
            if (46 == charId.get(charId.size()-1)) {
                charId.remove(charId.size()-1);
            }
        }
        // list 사이즈가 3보다 작으면, 마지막 문자열을 반복한다 (길이 = 3)
        if (3 > charId.size() && 0 < charId.size()) {
            char last = charId.get(charId.size()-1);
            for (int x = charId.size(); x < 3; x++) {
                charId.add(last);
            }
        }
        // list 사이즈가 0인경우, a문자를 반복한다 (길이 = 3)
        if (0 == charId.size()) {
            for (int j = 0; j < 3; j++) {
                answer += "a";
            }
        }
        // list의 값을 asnwer에 대입한다
        for (char getId : charId) {
            answer += String.valueOf(getId);
        }
        
        return answer;
    }
}

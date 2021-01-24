import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 제한조건
        if (1 > phone_book.length || 1000000 < phone_book.length) {
            return answer;
        } else {
            // 정렬
            Arrays.sort(phone_book);
            // 첫번째 값
            String def = phone_book[0];
            // 반복문: 첫번째 값과 그외의 값안에 포함되는지 확인한다
            for (int i = 1; i < phone_book.length; i++) {
                // 해당 문자열안에 첫번째 값이 포함되는 경우
                if (phone_book[i].contains(def)) {
                    // false로 바꾸고, 반복문을 탈출한다
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}

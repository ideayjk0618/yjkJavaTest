class Solution {
    public int solution(String name) {
        int answer = 0;

        // 위아래이동횟수
        int number = 0;
        int move = name.length()-1; // 최소 좌우 이동횟수

        // 이름 길이 만큼 반복.
        for (int i = 0; i < name.length(); i++) {
            int getAbc = (int) name.charAt(i);
            if (65 < getAbc) {
            	int up = getAbc - 65; // 커서 위
            	int down = 91 - getAbc; // 커서 아래
            	if (up <= down) {
            		number += up;
            	} else {
            		number += down;
            	}
            }
            
            int next = i+1; // 현재 i위치의 다음 위치의 값을 선정한다.
            
            while(next<name.length() && name.charAt(next) =='A') {
                next++;
                // 현재 위치 다음부터 name의 길이만큼 반복하며, A의 갯수를 체크한다.
            }
            
            move = Math.min(move, i+ i + (name.length() - next));
            // 최소값을 정하는 방법 : 현재의 최소의 값과, 현재위치i에서 + 다시 처음의 위치로 돌아가서 i  + (전체에서 a의 갯수를 뺀값) 을 더한다.
            
        }
        number += move;

        return answer = number;
    }
}

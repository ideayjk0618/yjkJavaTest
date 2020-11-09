class Solution {
    public int solution(String name) {
        int answer = 0;

        // 이동횟수
        int number = 0;
        int right = 0; // 오른쪽 이동
        int left = 0; // 왼쪽 이동

        // 이름 길이 만큼 반복.
        for (int i = 0; i < name.length(); i++) {
            int getAbc = (int) name.charAt(i);
            if (65 < getAbc) {
            	if (i != 0) {
            		right++;
            	}
            	int up = getAbc - 65; // 커서 위
            	int down = 91 - getAbc; // 커서 아래
            	if (up <= down) {
            		number += up;
            	} else {
            		number += down;
            	}
            } else if (65 == getAbc) {
                
                left = right;
            }
        }
        // System.out.print(number);
        // System.out.print(right +":"+left);
        answer = number + left + right;

        return answer;
    }
}

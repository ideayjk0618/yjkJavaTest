class Solution {
    public int solution(String name) {
        int answer = 0;
        
        int number = 0;
        
        // 1번 반복문 : 이름 길이 만큼 반복.
        for (int i = 0; i < name.length(); i++) {
            int getAbc = (int) name.charAt(i);
            if (65 < getAbc) {
            	if (number != 0) {
            		number++;
            	}
            	int a_z = getAbc - 65; // 커서 위
            	int z_a = 91 - getAbc; // 커서 아래
            	if (a_z < z_a) {
            		number += a_z;
            	} else {
            		number += z_a;
            	}
            	// System.out.println(a_z +":"+z_a);
            	// System.out.println(number);
            } else if (65 == getAbc) {
        		if (i > 1) {
        			// 왼쪽으로 방향을 튼다.
        			number++;
                    // 3,4,5,7 문제 맞음 -> 11번은 여전히 실패 12번 새롭게 실패
        		}
            }
            answer = number;
        }
        
        return answer;
    }
}

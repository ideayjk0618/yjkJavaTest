class Solution {
    public String solution(String number, int k) {
        String answer = "";
        // 만들어야하는 자릿수
		int resultLen = number.length() - k;
		
		int idx = 0; // 큰수 찾았으면 j는 그 위치에서 시작해야해서 인덱스 만들어줌.

		// 총 만들 자리수만큼 1번 반복문 실행
		for (int i = 0; i < resultLen; i++) {
			char max = 0;
			// 큰수를 찾아라.
			for (int j = idx; j <= k+i; j++) {
				char getNum = number.charAt(j);
				if (max < getNum) {
					max = getNum;
					idx = j + 1;
				}
			}
			answer += String.valueOf(max);
        }
        return answer;
    }
}

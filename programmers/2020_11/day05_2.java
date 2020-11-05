class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
		
		// 만들어야하는 자릿수
		int resultLen = number.length() - k;
		
		//StringBuilder sb = new StringBuilder(number); // 시간초과나서 힌트보니 스트링빌더 사용하면 빠를거라 그래서 변경.
	    // number를 StringBuilder에 넣으면 되는줄 알았는데 근데도 똑같이 시간초과가 나서 다른 힌트를 보니까 String에 욱여넣는것보다 출력 자체를 stringbbuilder에 넣는게 효과적이란 힌트를 다시 봄.
	    /* 작성자의 말에 따르면 아래와 같다. 
	    	c/c++, c#도 비슷하지만 JAVA로 구현했으니 java로 설명하자면
		String 의 +연산자를 사용하면 +operator 함수가 호출되고 내부에서 새로 StringBuilder를 생성하고 append 후 다시 toString() 하여 return해줍니다.
		(java 안한지 좀 되서 조금 다를 수 있음)
		-> 함수호출 n회, 지역변수 할당 n회, append n회, toString() n회, 지역변수 해제 1회

		하지만 StringBuilder 객체를 만들고 append를 하고 마지막에 toString()을 해주면
		-> append n회, toString() 1회

		함수호출, 지역변수 할당/소멸을 하지않고 toString()도 1회만 하므로 더 빨라집니다.
	    */
		
		int idx = 0; // 큰수 찾았으면 j는 그 위치에서 시작해야해서 인덱스 만들어줌.

		// 총 만들 자리수만큼 1번 반복문 실행
		for (int i = 0; i < resultLen; i++) {
			char max = 0;
			// 큰수를 찾아라.
			for (int j = idx; j <= k+i; j++) {
				char getNum = number.charAt(j);
				if (max < getNum) {
					max = getNum;
					if (max == 9) break;
					idx = j + 1;
				}
			}
			answer.append(max);
		}
        return answer.toString();
    }
}

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        // 힌트 : (한 옷의 종류수 + 1(안입는경우의수))* (한 옷의 종류수 + 1(안입는경우의수)) -(아무것도 안 입는경우의수)
        // 초기값을 1로 변경 -> 곱하기를 쓸 것이기 때문에, 0으로 초기값을 두지 않는다.
        int answer = 1;
        // Map<옷의 종류, 종류 수>
        HashMap<String, Integer> kindMap = new HashMap<>();
        
        // 반복문1 : 배열에 [1][2]에서 1을 담당
        for (int i = 0; i < clothes.length; i++) {
          // 반복문2 : 배열에 [1][2]에서 2을 담당
        	for (int j = 1; j < clothes[i].length; j++) {
            // 옷의 종류만 출력한다.
        		String getKind = clothes[i][j];
            // key에 존재하면, value의 값을 +1 한다.
        		if (kindMap.containsKey(getKind)) {
        			int dupCount = kindMap.get(getKind);
        			dupCount++;
        			kindMap.replace(getKind, dupCount);
        		} else {
              // key에 존재하지 않으면 Map에 추가한다.
        			kindMap.put(getKind, 1);
        		}
        	}
        }
        // 반복문3 : Map에서 value값만 출력해서 값을 계산한다
        for (int getNum : kindMap.values()) {
        	answer = answer * (getNum + 1);
        }
        
        return answer-1;
    }
}

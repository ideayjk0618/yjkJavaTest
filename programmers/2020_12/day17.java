import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // 힌트 : copyOfRange 를 이용해보자.
        // Arrays.copyOf(원본배열, 복사할 길이);
        // Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) 인덱스는 0부터 시작하는것 기준
        
        for (int i = 0; i < commands.length; i++) {
            // 원하는 부분만 복사해서 임시 배열에 넣는다
            int[] copyArr = Arrays.copyOfRange(array, (commands[i][0] - 1), commands[i][1]);
            // 오름차순
            Arrays.sort(copyArr);
            // 해당 위치만 출력
            answer[i] = copyArr[(commands[i][2] - 1)];
        }
        
        return answer;
    }
}

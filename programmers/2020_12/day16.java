import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        // 제한사항
        if (1 > array.length || 100 < array.length) {
            return answer;
        } else if (1 > commands.length || 50 < commands.length) {
            return answer;
        } else {
            String str_Arr = "";
            for (int arr : array) {
                if (1 > arr || 50 < arr) {
                    return answer;
                } else {
                    str_Arr += arr;
                }
            }
            answer = new int [commands.length];
            
            int times = 0;
            while (times < commands.length) {
                if (3 <= times) {
                    return answer;
                }
                // i: 문자열 자르는 시작위치, j: 끝 위치, k: 출력 위치
                int i = (commands[times][0]) - 1;
                int j = commands[times][1];
                int k = (commands[times][2]) - 1;
                
                String[] getArr = str_Arr.substring(i, j).split("");
                Arrays.sort(getArr);
                answer[times] = Integer.parseInt(getArr[k]);
                times++;
            }
        }
        return answer;
    }
}

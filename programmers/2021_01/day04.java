class Solution {
    
    // 고정 배열
    private int[] NO1 = {1, 2, 3, 4, 5};
    private int[] NO2 = {2, 1, 2, 3, 2, 4, 2, 5};
    private int[] NO3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    public int[] solution(int[] answers) {
        int[] student = {};
        int[] answer = new int [3];
        
        // 1,2,3번의 증가 인덱스
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        
        for (int ans : answers) {
            // 각 배열과 비교해서 +1를 한다
            if (ans == NO1[idx1]) {
                answer[0] = answer[0] + 1;
            }
            if (ans == NO2[idx2]) {
                answer[1] = answer[1] + 1;
            }
            if (ans == NO3[idx3]) {
                answer[2] = answer[2] + 1;
            }
            
            idx1++;
            idx2++;
            idx3++;
            // 인덱스가 각 배열의 마지막인경우 0으로 리셋
            if (NO1.length == idx1) {
                idx1 = 0;
            }
            if (NO2.length == idx2) {
                idx2 = 0;
            }
            if (NO3.length == idx3) {
                idx3 = 0;
            }
        }
        
        // 최대값 구하기
        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
        
        String result = "";
        // 최대값과 비교해서 같으면, i+1값을 String값으로 만든다. (오름차순)
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == max) {
                result = result + (i + 1);
            }
        }
        
        student = new int[result.length()];
        
        for (int j = 0; j < result.length(); j++) {
            student[j] = Integer.parseInt(String.valueOf(result.charAt(j)));
        }
        
        return student;
    }
}

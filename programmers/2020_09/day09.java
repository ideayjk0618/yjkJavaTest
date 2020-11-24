class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        
        // 전제조건: 행과 열의 크기가같은 행렬1,2

        // 열1 또는 2의 길이가 0일때 종료
        if(arr1.length < 0 || arr2.length < 0) {
            return answer;
        } else {
            // 열1 또는 2의 길이가 500보다 클때 종료
            if (arr1.length > 500 || arr2.length > 500) {
                return answer;
            } else if (arr1[0].length > 500 || arr2[0].length > 500) {
                // 행의 길이가 500이상일때 
                return answer;
            } else {
                // 선언
                answer = new int[arr1.length][arr1[0].length];
                
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr1[i].length; j++) {
                        answer[i][j] = arr1[i][j] + arr2[i][j];
                    }
                }
            }
        }        
        return answer;
    }
}

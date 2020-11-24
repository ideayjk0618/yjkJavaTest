class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        
        // 조건 : 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행
        
        // 제한조건 : 행의 길이 < 500
        // (행과 열의 크기가 같은 행렬이라고 했기 때문에 행의 길이만 체크한다.)
        if (500 < arr1.length || 500 < arr2.length) {
            return answer;
        } else {
            // 행렬1,2의 크키가 같아야만 해당 서비스를 진행한다.
            if (arr1.length == arr2.length) {
                answer = new int [arr1.length] [arr1[0].length];
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr1[0].length; j++) {
                        answer[i][j] = arr1[i][j] + arr2[i][j];
                    }
                }
            }
        }
        return answer;
    }
}

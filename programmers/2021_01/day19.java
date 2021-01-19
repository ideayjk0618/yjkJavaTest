import java.util.ArrayList;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 곱셈 : mk*kn=mn 1열길이 2행길이가 같아야 곱할수있음.
        // 그리고 ij의 성분은 1의 i행과 2의 j열을 차례대로 곱하여 더한 값임. (feat.수학방)
        
        // m (1의 열길이)
        int len1 = arr1.length;
        // n (2의 행길이)
        int len2 = arr2[0].length;
        // mn
        int[][] answer = new int[len1][len2];
        // 2의 열길이
        int len3 = arr2.length;
        
        // 반복문1: 행증가
        for (int i = 0; i < len1; i++) {
            int getNum1 = 0, getNum2 = 0;
            // 반복문2: 열증가
            for (int j = 0; j < len2; j++) {
                // 합계를 초기화한다
                int sum = 0;
                // 반복문3: 고정값ij를 두고 증가하는 z
                for (int z = 0; z < len3; z++) {
                    getNum1 = arr1[i][z];
                    getNum2 = arr2[z][j];
                    // getNum1과 2를 곱해서, sum에 더한다 
                    sum += getNum1 * getNum2;
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
}

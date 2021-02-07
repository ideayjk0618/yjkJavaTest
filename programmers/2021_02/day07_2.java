class Solution {
    public int[] solution(int n) {
        int boxs = 0;
        for (int i = 1; i <= n; i++) {
            boxs += i;
        }
        int[][] array = int new[n+1][n+1];
        int[] answer = new int[boxs];
        int count = 1;
        int a1 = 0;
        while (count < boxs) {
            
            for (int a = 0; a < n; a++) {
                array[a1][a] = count;
                count++;
            }
            a--;
            for (int b = 1; b < n; b++) {
                arr[a][b] = count;
                count++;
            }
            b--;
            for (int c = b; c > 0; c--) {
                arr[c][c] = count;
                count++;
            }
            a1++;
        }
        
        for (int x = 0; )
        
        return answer;
    }
}

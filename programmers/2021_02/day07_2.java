class Solution {
    public int[] solution(int n) {
        int boxs = 0;
        for (int i = 1; i <= n; i++) {
            boxs += i;
        }
        int[][] arr = new int [n+1][n+1];
        int[] answer = new int[boxs];
        int count = 1;
        int a1 = 0;
        int a = 0, b = 0, c = 0;
        while (count <= boxs) {
            for (a = 0; a < n; a++) {
                arr[a1][a] = count;
                count++;
            }
            a--;
            for (b = 1; b < n; b++) {
                arr[a][b] = count;
                count++;
            }
            b--;
            for (c = b; c > 0; c--) {
                arr[c][c] = count;
                count++;
            }
            a1++;
        }
        
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                int num = arr[x][y];
                if (0 != num) {
                    System.out.println(num);
                }
            }
        }
        
        return answer;
    }
}

class Solution {
    public int[] solution(int n) {
        int boxs = 0;
        for (int i = 1; i <= n; i++) {
            boxs += i;
        }
        int[][] arr = new int [n+1][n+1];
        int[] answer = new int[boxs];
        int count = 1;
        int a1 = 0, a2 = 0, a3 = 1;
        int a = 0, b = 0, c = 0;
        while (count <= boxs) {
            for (a = a2; a < n; a++) {
                if (1 > arr[a][a1]) {
                    arr[a][a1] = count;
                    System.out.println("a"+a+":"+count);
                    count++;
                }
            }
            a--;
            if (count >= boxs) {
                break;
            }
            for (b = a3; b < n; b++) {
                if (1 > arr[a][b]) {
                    arr[a][b] = count;System.out.println("b"+b+":"+count);
                    count++;
                }
            }
            b--;
            if (count >= boxs) {
                break;
            }
            b--;
            // System.out.println("bbb"+b);
            for (c = b; c > 0; c--) {
                if (1 > arr[c][c]) {
                    arr[c][c] = count;System.out.println("c"+c+":"+count);
                    count++;
                }
            }
            if (count >= boxs) {
                break;
            }
            a1++;
            a2++;
            a3++;
        }
        int idx = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                int num = arr[x][y];
                if (0 != num) {
                    //System.out.println(num);
                    answer[idx++] = num;
                }
            }
        }
        
        return answer;
    }
}

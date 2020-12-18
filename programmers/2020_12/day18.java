class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        
        // 힌트 : 동적계획법(Dynamic Programming)에서 Dottom-Up DP를 이용
        // Bottom-Up: 작은 부분문제(Sub Problem)를 미리 계산해두고, 이 문제들을 모아 큰 문제를 해결하는 방식
        // Top-Down: 큰 문제(Main Problem)에서 작은 부분 문제(Sub Problem)를 재귀적으로 호출하여 리턴된 값으로 문제를 해결하는 방식
        
        // row, column 사이즈
        int row = board.length;
        int column = board[0].length;
        
        // 1의 사이즈인경우에는 1로 리턴한다
        if (1 == row || 1 == column) {
            return answer = 1;
        }
        
        // 사각형의 최소 단위 (1x1제외) 2x2 라고 한다면
        // 가로세로의 길이를 알수있는 위치는 1,1(i,j)이며, 시작위치는 i,j=1부터 시작한다
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                // 0이 아닐때 i,j의 가로세로의 길이를 알수있는 조건이 성립됨
                if (0 != board[i][j]) {
                    // i,j의 길이를 알기위해서는i,j의 대각선: 0,0[i-1][j-1] /위: 0,1[i-1][j] /옆: 1,0[i][j-1] 에서
                    // 최소값을 찾아, 최소값 + 1로 i,j의 값을 갱신한다
                    int min1 = Math.min(board[i-1][j-1], board[i-1][j]);
                    board[i][j] = (Math.min(min1, board[i][j-1])) + 1;
                    // 그리고 최대값을 찾는다
                    answer = Math.max(answer, board[i][j]);
                }
            }
        }
        
        // 정사각형이므로 가로와 세로가 같으므로 answer을 다시 곱한다
        answer *= answer;

        return answer;
    }
}

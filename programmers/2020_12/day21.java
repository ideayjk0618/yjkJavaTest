class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        // 모서리
        int con = 2;
        // 세로
        int bre = 1;
        
        // 제일 긴 한변의 길이 (모서리 제외) = 노란색의 가로 길이
        int len = (brown / 2) - con -bre;
        
        // 노란색 남은 개수 = 노란색 전체 - 노란색 길이
        int rem = yellow - len;
        
        // 남은 노란색 개수가 0이될때까지 반복한다
        while (rem > 0) {
            bre++; // 세로를 1만큼 늘림
            len--; // 가로를 1만큼 줄임
            
            // 노란색 남은 갯수 = 노란색 전체 - (노란색 길이 * 세로 수)
            rem = yellow - (len * bre);
            
            // 노란색 개수가 0이되면 반복문 탈출
            if (rem == 0) {
                break;
            }          
        }
        // 가로 = 노란색길이 + 모서리
        answer[0] = len + con;
        // 세로 = 높이 + 모서리
        answer[1] = bre + con;
        
        return answer;
    }
}

function solution(n) {
    var answer = '';
    
    // 반복문: n이 0이 되면 탈출한다.
    while (n > 0) {
        // 조건문: n을 2로 나눠서 0이 아니면 수, 0이면 박을 입력한다.
        if (n % 2 != 0) {
            answer = '수' + answer;
        } else {
            answer = '박' + answer;
        }
        // 조건문이 끝나면, n에서 -1를 한다.
        n--;
    }
    
    return answer;
}

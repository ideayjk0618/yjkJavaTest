def solution(n):
    answer = ''
    # 반복문 사용 : 1부터 n+1까지 (range은 시작값~n-1까지 표현하기때문에 n의 값까지 하기위해서는 +1를 해야함)
    for i in range (1, n+1):
        # 조건문 사용 : i를 2로 나눈 결과 값이 0이 아닌경우 = 홀수
        if i % 2 != 0:
            answer += "수"
        else:
            answer += "박"    
    return answer

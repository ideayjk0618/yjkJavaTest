def solution(arr, divisor):
    answer = []
    # 배열길이 구하는 방법 len()
    arrLen = len(arr)
    # 제한사항
    if (1 > arrLen) :
        return answer
    
    for i in range(0, arrLen) :
        if (arr[i] % divisor == 0) :
            # arr[i]에 divisor를 나눠서 나머지가 0인경우 배열에 추가
            answer.append(arr[i])
    
    answerLen = len(answer)
    # answer배열의 길이가 0인경우 -1을 반환한다.
    if (0 == answerLen) :
        return [-1]
    
    # 오름차순 정렬
    answer.sort()
    # 참고 reverse()를 이용하면 현재 배열을 반대로 뒤집는다.
            
    return answer

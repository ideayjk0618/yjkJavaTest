import datetime # datetime이라는 날짜클래스가 있어서 사용한다.

def solution(a, b):
    answer = ''
    # 날짜를 미리 배열에 넣어준다.
    array = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']
    # datetime을 이용하여, 날짜를 먼저 설정한다.  
    dateResult = datetime.date(2016, a, b)
    # 설정한 날짜결과값에 weekday를 이용하여 숫자로 요일을 반환받는다.
    # 월요일 : 0 ~ 일요일 : 6
    weekNum = dateResult.weekday()
    # 출력받은 숫자로 배열에 저장된 해당 값을 출력한다.
    answer = array[weekNum]
    return answer

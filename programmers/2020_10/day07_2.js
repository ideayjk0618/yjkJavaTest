function solution(arr) {
    var answer = 0;
    
    var arrPlus = 0; // 총합

    for (var i = 0; i < arr.length; i++) {
        arrPlus += arr[i];
    }
    answer = arrPlus / arr.length;
    
    return answer;
}
    // 아래의 방법으로 하니까 안풀리던데 왜그러는걸까? 그냥 막 콘솔로 찍어보니까 arrPlus가 001 이렇게 나옴..
    // for (var arrVar in arr) {
    //     arrPlus += arrVar;
    // }

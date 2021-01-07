class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        
        // 잘려진 사각형 갯수 구하는 방법
        // 가로 + 세로 - 최대공약수 -> 최대공약수만큼 겹치는 사각형이 있어서 겹치는 사각형 갯수를 빼야함
        /** 제일 작은 직사각형을 기준으로 한다.
            xO
            XX
            Ox
            여기서 선으로 나눠 삼각형기준으로, 잘려지는것은 X이고, 그중에서 겹치는 사각형이 소문자x임.
            얘를 뺌, 이 2x3사이즈의 사각형 기준으로는 x가 2개고 둘이 잘린게 사각형 사이즈 한개와 같아서, 1을 뺌. 이때 이 1이 가로 세로의 최대공약수와 같다.
            4x6인경우에는? 그려보면 선에 걸치는 소문자x가 4개고 사각형사이즈로 따지면 2개다.
            이때 2는 4,6의 최대공약수다.
        **/
        
         int cutting = w + h - euclidean(w, h);
        
        return answer;
    }
    
    // 최대공약수 구하는 유클리드 호제법 이용 (10/21문제참고)
    public int euclidean(int w2, int h2) {
        return 1;
    }
}

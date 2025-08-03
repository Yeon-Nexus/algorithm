
//정수 제곱근 판별

class Description {
    public long solution(long n) {
        long answer = 0;
        long x = 0;
        while(x <= n){
            if (n == x * x){
                answer = (x+1)*(x+1);
                return answer;
            }
            x++;
        }
        return -1;
    }
}

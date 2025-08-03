
//최대공약수 최소공배수 구하기

class DivisorMultiple {
    public int[] solution(int n, int m) {
        int[] answer = {0,0};
        int a = 0;
        if(n > m)
            a = m;
        else
            a = n;
        for(int i =a; i >= 2 ; i--){
            if(n%i == 0 && m%i == 0){
                answer[0] = i;   
                int x = n/i;
                int y = m/i;
                answer[1]=i*x*y;
                return answer;
            }
            answer[0]=1;
            answer[1]=n*m;
        }    
        return answer;
    }
}

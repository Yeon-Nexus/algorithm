
//하샤드 수

class HassHadNum {
    public boolean solution(int x) {
        boolean answer = true;
        int n = x;
        int num = 0;
        while(n != 0){
            num += n%10;
            n = n/10;
        }
        if(x%num == 0)
            return true;
        else
            return false;
    }
}

class NumStrSum {
    public int solution(String numStr) {
        int answer = 0;
        for(int i=0; i<numStr.length(); i++) {
            char num = numStr.charAt(i);
            answer += num -'0';
        }
        return answer;
    }
}
//행렬의 덧셈

class SolutionAdd {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[0].length;
        int[][] answer = new int[row][col];
        for(int a=0; a < row; a++){
            for(int b=0; b < col; b++){
                answer[a][b] = arr1[a][b] + arr2[a][b];
            }
        }
        return answer;
    }
}

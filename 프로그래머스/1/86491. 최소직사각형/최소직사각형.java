

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] ansArr = new int[2];
        ansArr = sizes[0];

        //반복문
        for(int i=1;i<sizes.length;i++){
        
            //현재쌍과 다음값(가로 세로/ 세로 가로) 비교
            int a = Math.max(ansArr[0], sizes[i][0]); 
            int b = Math.max(ansArr[1], sizes[i][1]); 
            int c = Math.max(ansArr[0], sizes[i][1]); 
            int d = Math.max(ansArr[1], sizes[i][0]); 
            if(a*b > c*d){
                ansArr[0] = c;
                ansArr[1] = d;
            }
            else{
                ansArr[0] = a;
                ansArr[1] = b;
            }

        }
        
        answer = ansArr[0] * ansArr[1];
        return answer;
    }
}
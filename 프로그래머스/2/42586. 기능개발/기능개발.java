import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        

        for (int i = 0; i < progresses.length; i++) {
            int remaining = 100 - progresses[i];
     
            int days = remaining / speeds[i];
            if (remaining % speeds[i] != 0) days++;
            
            q.add(days);
        }
        
        List<Integer> answerList = new ArrayList<>();
        
 
        while (!q.isEmpty()) {
            int day = q.poll(); 
            int count = 1;      

            while (!q.isEmpty() && q.peek() <= day) {
                q.poll();
                count++;
            }
            
            answerList.add(count);
        }
        

        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
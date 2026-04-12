import java.util.*;

class Solution {
   
    class Process {
        int priority;
        int location;

        public Process(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }

    public int solution(int[] priorities, int location) {
      
        Queue<Process> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process(priorities[i], i));
        }

        int answer = 0; 


        while (!queue.isEmpty()) {
            Process current = queue.poll();
            boolean hasHigherPriority = false;


            for (Process p : queue) {
                if (p.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {

                queue.add(current);
            } else {

                answer++;
                

                if (current.location == location) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}
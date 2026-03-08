import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
   
        Stack<Integer> stack = new Stack<>();
        
        for(int num : arr){

            if(stack.empty() || num != stack.peek()){
                stack.push(num);
            }
        }
        
        int[] answer = new int[stack.size()];
        for (int i=stack.size();i>0;i--){
            answer[i-1] = stack.pop();
        }
        return answer;
    }
}
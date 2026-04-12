import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 1. 카테고리별로 개수를 센다
        Map<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }

        // 2. 각 개수에 +1을 해서 모두 곱한다
        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1);
        }

        // 3. 아무것도 입지 않은 경우 1을 뺀다
        return answer - 1;
    }
}
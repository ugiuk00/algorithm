import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (String phone : phone_book) {
            for (int j = 1; j < phone.length(); j++) {

                if (map.containsKey(phone.substring(0, j))) {
                    return false;
                }
            }
        }

        return true;
    }
}
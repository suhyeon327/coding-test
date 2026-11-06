import java.util.Map;

class Solution {
    public int solution(String s) {
        Map<String, String> card = Map.of("zero", "0", "one", "1", "two", "2", "three", "3", "four", "4", "five", "5", "six", "6", "seven", "7", "eight", "8", "nine", "9");
        int answer = 0;
        String str = "";
        
        for (String mapKey : card.keySet()) {
            str = s.replace(mapKey, card.get(mapKey));
            s = str;
        }
        
        answer = Integer.valueOf(str);
        
        return answer;
    }
}
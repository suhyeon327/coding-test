import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();
        
        for (String s : arr) {
            if (!s.equals("")) {
                list.add(s);
            }
        }
        
        return list.toArray(new String[0]);
    }
}
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String strnum = String.valueOf(i);
            boolean flag = true;
            
            for (char charnum : strnum.toCharArray()) {
                if (charnum != '0' && charnum != '5') {
                    flag = false;
                }
            }
            
            if (flag == true) {
                answer.add(Integer.parseInt(strnum));
            }
        }
        
        if (answer.isEmpty())
            answer.add(-1);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
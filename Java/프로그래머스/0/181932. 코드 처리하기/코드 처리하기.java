class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            if (code.charAt(idx) == '1') {
                if (mode == 1) {
                    mode = 0;
                    continue;
                } else {
                    mode = 1;
                    continue;
                }
            }
            
            if (mode == 0) {
                if (idx % 2 == 0)
                    ret += code.charAt(idx);
            } else {
                if (idx % 2 == 1)
                    ret += code.charAt(idx);
            }
        }
        
        if (ret.equals(""))
            ret = "EMPTY";
        return ret;
    }
}
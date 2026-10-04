package LeetCode;



public class Problem_10 {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();

        boolean m = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        boolean k = p.length() >= 2 && p.charAt(1) == '*';
        if(k){
            return isMatch(s, p.substring(2)) || (m && isMatch(s.substring(1), p));
        }
        return m && isMatch(s.substring(1), p.substring(1));
    }
}

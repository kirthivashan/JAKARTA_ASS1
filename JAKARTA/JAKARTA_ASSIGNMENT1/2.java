//2
public class Continuous {
    
    public static int count(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        char current = s.charAt(0);
        int cc = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == current) {
                cc++;
            } else {
                if (cc > 2) {
                    count++;
                }
                current = s.charAt(i);
                cc = 1;
            }
        }
        if (cc > 2) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "aaabbbcccdeee";
        System.out.println(count(s));
    }
}


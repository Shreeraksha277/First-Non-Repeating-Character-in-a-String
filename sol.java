import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "aabcbcde";
        char result = firstNonRepeating(str);
        
        if(result == '-')
            System.out.println(-1);
        else
            System.out.println(result);
    }

    public static char firstNonRepeating(String str) {
        int[] freq = new int[256];

        // Count frequency
        for(char c : str.toCharArray()) {
            freq[c]++;
        }

        // Find first non-repeating
        for(char c : str.toCharArray()) {
            if(freq[c] == 1) {
                return c;
            }
        }

        return '-';
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Slowest_Key {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int mx = 0;
        int k = 0;
        for (int i = 0; i < releaseTimes.length; i++) {
            if (i == 0) {
                mx = Math.max(k, releaseTimes[i]);
                k = releaseTimes[i];
            } else {
                mx = Math.max(mx, releaseTimes[i] - k);
                k = releaseTimes[i];
            }
        }
        ArrayList<Character> s = new ArrayList<>();
        for (int i = 0; i < releaseTimes.length; i++) {
            if (i == 0) {
                if (releaseTimes[i] == mx) {
                    s.add(keysPressed.charAt(i));
                }
            } else {
                if (releaseTimes[i] - releaseTimes[i - 1] == mx) {
                    s.add(keysPressed.charAt(i));
                }
            }
        }
        Collections.sort(s);
        return s.get(s.size() - 1);
    }
}

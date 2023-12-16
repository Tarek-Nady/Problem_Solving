package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Find_the_Kth_Largest_Integer_in_the_Array {
    public String kthLargestNumber(String[] nums, int k) {
        ArrayList<String> a = new ArrayList<>();
        for(String x:nums){
            a.add(x);
        }
        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return a.length() - b.length();
                }
                return a.compareTo(b);
            }
        });
        Collections.reverse(a);
        return a.get(k-1);
    }
}

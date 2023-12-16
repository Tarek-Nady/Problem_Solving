package leetcode;

import java.util.PriorityQueue;

public class Smallest_Number_in_Infinite_Set {
    PriorityQueue<Integer> values = values = new PriorityQueue<>();
    public Smallest_Number_in_Infinite_Set() {

        for(int i=1;i<=1000;i++){
            values.add(i);
        }
    }

    public int popSmallest() {
        if(!values.isEmpty()) return values.poll();
        return 0;
    }

    public void addBack(int num) {
        if(!values.contains(num))values.add(num);
    }
}

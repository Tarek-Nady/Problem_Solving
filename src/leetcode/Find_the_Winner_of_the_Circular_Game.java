package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Find_the_Winner_of_the_Circular_Game {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        //1 2 3 4 5
        while(q.size()>1){
            for(int i=0;i<k-1;i++){
                int front = q.poll(); ///3 4 5 1
                q.add(front);   // 5 1 3
            }
            q.poll(); // 5 1 3
        }
        return q.peek();
    }
}

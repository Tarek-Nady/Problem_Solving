package leetcode;

import java.util.Arrays;

public class Maximize_Area_of_Square_Hole_in_Grid {
    public int maximizeSquareHoleArea(int n, int m, int[] hbars, int[] vbars) {
        Arrays.sort(hbars);
        Arrays.sort(vbars);
        int maxh = 0,maxv=0;
        int count=1;
        for(int i=1;i<hbars.length;i++){
            if(hbars[i]==0)break;
            int dif = hbars[i]-hbars[i-1];
            if(dif==1) {
                if(count==0)count=2;
                else count++;
            }
            else {
                maxh = Math.max(maxh,count);
                count=0;
            }
        }
        maxh = Math.max(maxh,count);
        count=1;
        for(int i=1;i<vbars.length;i++){
            if(vbars[i]==0)break;
            int dif = vbars[i]-vbars[i-1];
            if(dif==1) {
                if(count==0)count=2;
                else count++;
            }
            else {
                maxv = Math.max(maxv,count);
                count=0;
            }
        }
        maxv = Math.max(maxv,count);
        maxh+=1;
        maxv+=1;
        int ans = Math.min(maxv,maxh)*Math.min(maxv, maxh);
        return ans;
    }
}

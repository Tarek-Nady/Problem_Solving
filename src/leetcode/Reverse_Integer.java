package leetcode;

public class Reverse_Integer {
    public  static int reverse(int x) {
        String d = String .valueOf(x);
        int ind =d.length()-1;
        String validvalue = "";
        for(int i= d.length()-1;i>=0;i--) {
            if(d.charAt(i)!='0') {
                ind = i;
                break;
            }
        }
        String validvalue2="";

        if (x >= 0) {
            for (int i = ind; i >= 0; i--) {
                validvalue += d.charAt(i);
            }
        }
        else {
            for (int i = ind; i > 0; i--) {
                validvalue += d.charAt(i);
            }
            long ds = Long.valueOf(validvalue);
            ds*=-1;
            validvalue2 = String.valueOf(ds);
        }

        long mxval =(long) Math.pow(2,31)-1;
        long mival =(long) Math.pow(2,31);
        mival*=-1;

        long valid=0;
        if(x<0)valid = Long.valueOf(validvalue2);
        else valid = Long.valueOf(validvalue);
        if(valid>mxval||valid<mival) {
            return 0;
        }
        else {
            int ans = (int)valid;
            return ans;
        }
    }
}

class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        if(nn<0)
            nn = -nn;
        double ans = 1;
        while(nn>0)
        {
            if(nn%2 == 0)
            {
                x *=x;
                nn = nn/2;
            }
            else
            {
                ans *=x;
                nn -= 1;
            }
        }
        if(n<0)
            return 1/ans;
        return ans;
    }
}

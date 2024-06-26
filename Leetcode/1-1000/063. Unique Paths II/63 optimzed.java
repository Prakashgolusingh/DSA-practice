class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] ==1)
            return 0;
        obstacleGrid[0][0] = 1;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(obstacleGrid[i][j] == 1 &&(i !=0 || j != 0))
                    obstacleGrid[i][j] = 0;
                else if(obstacleGrid[i][j] == 0)
                {
                    int sum = 0;
                    if(i>0)
                        sum += obstacleGrid[i-1][j];
                    if(j>0)
                        sum += obstacleGrid[i][j-1];
                    obstacleGrid[i][j] = sum;
                }
            }
        }
        return obstacleGrid[m-1][n-1];
    }
}

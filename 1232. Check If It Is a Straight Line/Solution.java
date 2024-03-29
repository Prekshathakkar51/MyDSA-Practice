class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

       
        // --If there are two points only then must will in straight line
        if(coordinates.length==2)
        {
            return true;
        }

        int i;

        // --If points are on Y-axis i.e X-axis will be 0 for all given points
        for(i=0;i<coordinates.length-1;i++)
        {
            if(coordinates[i][0]==coordinates[i+1][0])
            {
                continue;
            }
            else
            {
                break;
            }
        }
        if(i==coordinates.length-1)
        {
            return true;
        }


        // --If points are on X-axis i.e Y-axis will be 0 for all given points
        for(i=0;i<coordinates.length-1;i++)
        {
            if(coordinates[i][1]==coordinates[i+1][1])
            {
                continue;
            }
            else
            {
                break;
            }
        }
        if(i==coordinates.length-1)
        {
            return true;
        }


        // --For all other rest conditions we will calculate the slope of line for given points
        double slope1;
        double slope2;
        slope1=(double)(coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0]);
        for(i=1;i<coordinates.length-1;i++)
        {
            slope2=(double)(coordinates[i+1][1]-coordinates[i][1])/(coordinates[i+1][0]-coordinates[i][0]);
            if(slope1!=slope2)
            {
                return false;
            }
        }
        return true;        
    }
}
        
        
    

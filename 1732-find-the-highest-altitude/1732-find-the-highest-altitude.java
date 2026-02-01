class Solution {
    public int largestAltitude(int[] gain) {
        int maxPoint = 0;
        int point = 0;

        for(int i = 0; i < gain.length; i++){
            point = gain[i] + point;
            maxPoint = Math.max(point, maxPoint);
        }
        return maxPoint;

        
    }
}
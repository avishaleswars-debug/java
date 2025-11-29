class MostCOntainingWater{
   
    public static int maxArea(int[] height) {
        int left=0;
     int maxarea=0;
        
        int right =height.length-1;
        while(left<right){
           int w=right-left;
           int l=Math.min(height[left],height[right]);
           int area=w*l;
            maxarea=Math.max(maxarea,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right++;
            }

        }
        return maxarea;

    }
    public static void main(String[] args) {
        int arr={1,2,3,1,1,2,5};
        maxArea(arr);
    }

}
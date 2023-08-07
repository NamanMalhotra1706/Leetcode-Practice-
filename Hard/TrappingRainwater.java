class TrappingRainWater{
     public int trap(int[] height) {

        int left=0;
        int right=0;

        int leftMax[] = new int[height.length];
        int RightMax[] = new int[height.length];

        // Left Max Height
        for(int i=0;i<height.length;i++){
            leftMax[i] = Math.max(left,height[i]);
            left=leftMax[i];
        }

        // Right Max Height
    
        for(int i=height.length-1;i>=0;i--){
           RightMax[i] = Math.max(right,height[i]);
           right=RightMax[i];
        }

        int count=0;
        for(int i=0;i<height.length;i++){
            count+=Math.min(leftMax[i],RightMax[i])-height[i];
        }

        return count;
    }

}
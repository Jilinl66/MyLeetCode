package happy2017;

//42. Trapping Rain Water
public class test42 {
    public int trap(int[] height) {
        int a = 0, b = height.length - 1;
        int leftmax = 0, rightmax = 0;
        int max = 0;
        while(a <= b){
            leftmax = Math.max(leftmax, height[a]);
            rightmax = Math.max(rightmax, height[b]);        
            if(leftmax < rightmax){
            	max += leftmax - height[a];
            	a++;
            }
            else{
            	max += rightmax - height[b];
            	b--;
            }
        }
        return max;
    }
}

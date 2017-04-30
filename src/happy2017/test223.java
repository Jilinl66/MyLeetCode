package happy2017;
//223. Rectangle Area 
public class test223 {
//	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
//		int left = Math.max(A,E), right = Math.max(Math.min(C,G), left);
//	    int bottom = Math.max(B,F), top = Math.max(Math.min(D,H), bottom);
//	    return (C-A)*(D-B) - (right-left)*(top-bottom) + (G-E)*(H-F);
//	}
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaA = (C - A) * (D - B);
        int areaB = (G - E) * (H - F);
        int left = Math.max(A, E), right = Math.min(C, G), top = Math.min(D, H), bottom = Math.max(B, F);
        int areaOverlap = 0;
        if(right > left && top > bottom)
        	areaOverlap = (right - left) * (top - bottom);
       return areaA + areaB - areaOverlap;
    }
}

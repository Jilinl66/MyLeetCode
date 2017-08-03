package happy2017;
//223. Rectangle Area 
public class test223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	int area1 = (C - A) * (D - B);
    	int area2 = (G - E) * (H - F);
    	int left = Math.max(A, E), right = Math.min(C, G), top = Math.min(D, H), bottom = Math.max(B, F);
    	int overlap = (right > left? right - left: 0) * (top > bottom? top - bottom: 0);
    	return area1 + area2 - overlap;
    }
}

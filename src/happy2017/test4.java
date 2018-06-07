package happy2017;

//4. Median of Two Sorted Arrays
public class test4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if(Math.max(m, n) == 0)
        	throw new IllegalArgumentException("Invalid input.");
        if(m > n) {
        	int[] temp = nums1;
        	nums1 = nums2;
        	nums2 = temp;
        	m = nums1.length;
        	n = nums2.length;
        }
        int imin = 0, imax = m, halfLen = (m + n + 1)/2;
        int maxLeft, minRight;
        while(imin <= imax) {
        	int i = (imin + imax) / 2;
        	int j = halfLen - i;
        	if(i < m && j > 0 && nums2[j - 1] > nums1[i]) {
        		imin = i + 1;	
        	}
        	else if(i > 0 && j < n && nums1[i - 1] > nums2[j]) {
        		imax = i - 1;
        	}
        	else {
        		if(i == 0)
        			maxLeft = nums2[j - 1];
        		else if(j == 0)
        			maxLeft = nums1[i - 1];
        		else
        			maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
        		if((m + n) % 2 == 1)
        			return maxLeft;
        		else {
        			if(i == m)
        				minRight = nums2[j];
        			else if(j == n)
        				minRight = nums1[i];
        			else
        				minRight = Math.min(nums1[i], nums2[j]);
        			return (maxLeft + minRight)/2.0;
        		}
        	}
        }
        throw new IllegalArgumentException("No median solution");
    }
}

/**
 *  Google Zenefits Microsoft Apple Yahoo Dropbox Adobe
 * imin <= imax, <= not <
 */

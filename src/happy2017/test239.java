package happy2017;

import java.util.ArrayDeque;
import java.util.Deque;
//239. Sliding Window Maximum
public class test239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
    	if(nums.length == 0 || k<= 0) return new int[0];
    	int[] res = new int[nums.length - k + 1];
        Deque<Integer> queue =  new ArrayDeque<>();
        for(int i = 0; i < nums.length; i++){
        	while(!queue.isEmpty() && queue.peek() < i - (k - 1))
        		queue.poll();
        	while(!queue.isEmpty() && nums[queue.peekLast()] < nums[i])
        		queue.pollLast();
        	queue.offer(i);
        	if(i >= k -1)
        		res[i - (k - 1)] = nums[queue.peek()];
        }
        return res;
    }
}

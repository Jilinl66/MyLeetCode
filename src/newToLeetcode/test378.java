package newToLeetcode;
import java.util.PriorityQueue;

public class test378 {
	public int kthSmallest(int[][] matrix, int k) {
		int row = matrix.length;
		PriorityQueue<Tuple> pQueue = new PriorityQueue<Tuple>();
		for(int j = 0; j<row; j++)
			pQueue.offer(new Tuple(0, j, matrix[0][j]));
		for (int i = 0; i < k - 1; i++){
			Tuple tuple = pQueue.poll();
			if (tuple.x == row - 1)
				continue;
			pQueue.offer(new Tuple(tuple.x + 1, tuple.y, matrix[tuple.x+1][tuple.y]));
		}
		return pQueue.poll().val;
    }
	
	class Tuple implements Comparable<Tuple>{
		int x, y, val;
		public Tuple(int x, int y, int val){
			this.x = x;
			this.y = y;
			this.val = val;
		}
		public int compareTo(Tuple t){
			return this.val - t.val;
		}
	}
}

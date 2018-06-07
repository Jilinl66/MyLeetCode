package happycoding2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


public class BusinessInfoClass {
	
	public static void main(String[] args) {
		BusinessInfoClass bClass = new BusinessInfoClass();
		BusinessInfo bi1 = bClass.new BusinessInfo(101, 5.2);
		BusinessInfo bi2 = bClass.new BusinessInfo(102, 2);
		BusinessInfo bi3 = bClass.new BusinessInfo(103, 3);
		BusinessInfo bi4 = bClass.new BusinessInfo(104, 5.45);
		BusinessInfo bi5 = bClass.new BusinessInfo(106, 5.32);
		// Create list from array
		
		List<BusinessInfo> businesses = Arrays.asList(bi1, bi2, bi3, bi4, bi5);
		List<BusinessInfo> sortedlist = bClass.sortBusinessesByRating(businesses);
		for (BusinessInfo bi: sortedlist) {
			System.err.println(bi.id + " " + bi.rating);
		}
	}
	
	
	public class BusinessInfo {
		int id;
		double rating;
		
		public BusinessInfo(int id, double rating) {
			this.id = id;
			this.rating = rating;
		}
	}

	public List<BusinessInfo> sortBusinessesByRating(List<BusinessInfo> businesses) {
			PriorityQueue<BusinessInfo> queue = new PriorityQueue<>(new Comparator<BusinessInfo>() {

				@Override
				public int compare(BusinessInfo o1, BusinessInfo o2) {
					if (o1.rating < o2.rating) {
						return 1;
					} else if (o1.rating > o2.rating) {
						return -1;
					}
					return 0;
				}
			});
			for (int i = 0; i < businesses.size(); i++) {
				queue.offer(businesses.get(i));
			}
			List<BusinessInfo> resList = new ArrayList<>();
			while(!queue.isEmpty()) {
				resList.add(queue.poll());
			}
			// Medium
//			int size = queue.size();
//			int midIndex = (size - 1)/2;
//			for (int i = 0; i < midIndex; i++) {
//				queue.poll();
//			}
//			System.err.println(midIndex);
//			double mid;
//			if (size % 2 == 0) {
//				mid = (queue.poll().rating + queue.poll().rating) / 2;
//			} else {
//				mid = queue.poll().rating;
//			}
			return resList;
	}
}

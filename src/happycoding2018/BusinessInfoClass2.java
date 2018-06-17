package happycoding2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


public class BusinessInfoClass2 {
	
	public static void main(String[] args) {
		BusinessInfoClass2 bClass = new BusinessInfoClass2();
		BusinessInfo bi1 = bClass.new BusinessInfo(101, 5);
		BusinessInfo bi2 = bClass.new BusinessInfo(102, 2);
		BusinessInfo bi3 = bClass.new BusinessInfo(103, 3);
		BusinessInfo bi4 = bClass.new BusinessInfo(104, 5);
		BusinessInfo bi5 = bClass.new BusinessInfo(105, 5);
		
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
		Collections.sort(businesses, new Comparator<BusinessInfo>() {

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
		return businesses;
	}
}

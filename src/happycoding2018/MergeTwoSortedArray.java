package happycoding2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArray {
	
	public static void main(String[] args) {
		MergeTwoSortedArray mergeTwoSortedArray = new MergeTwoSortedArray();
		Item item1 = mergeTwoSortedArray.new Item(0000, 950);
		Item item2 = mergeTwoSortedArray.new Item(0001, 850);
		Item item3 = mergeTwoSortedArray.new Item(0001, 800);
		Item item4 = mergeTwoSortedArray.new Item(0000, 830);
		Item item5 = mergeTwoSortedArray.new Item(0001, 820);
		Item item6 = mergeTwoSortedArray.new Item(0001, 790);
		
		List<Item> list1 = Arrays.asList(item1, item2, item3);
		List<Item> list2 = Arrays.asList(item4, item5, item6);
		
		
		List<Item> res = mergeTwoSortedArray.merge(list1, list2);
		for (Item item: res) {
			System.out.println(item.value);
		}
	}
	
	public class Item {
		int id;
		int value;
		
		public Item(int id, int value) {
			this.id = id;
			this.value = value;
		}
	}
	
	public List<Item> merge(List<Item> list1, List<Item> list2) {
		List<Item> res = new ArrayList<>();
		int i1 = 0, i2 = 0;
		while(i1 < list1.size() && i2 < list2.size()) {
			if (list1.get(i1).value > list2.get(i2).value) {
				res.add(list1.get(i1++));
			} else if (list1.get(i1).value < list2.get(i2).value){
				res.add(list2.get(i2++));
			} else {
				res.add(list1.get(i1++));
				res.add(list2.get(i2++));
			}
		}
		while(i1 < list1.size()) {
			res.add(list1.get(i1++));
		}
		while(i2 < list2.size()) {
			res.add(list2.get(i2++));
		}
		return res;
	}
}
 
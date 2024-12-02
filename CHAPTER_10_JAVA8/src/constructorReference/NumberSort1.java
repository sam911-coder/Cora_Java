package constructorReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberSort1 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);

		System.out.println("Before Sort :: " + al);
		Collections.sort(al, new NumberComparator());
		System.out.println("After Sort :: " + al);

	}
}

class NumberComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i, Integer j) {
		if (i > j) {
			return -1;
		} else if (i < j) {
			return 1;
		}

		return 0;
	}

}

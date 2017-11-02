package ArrayQuestion;

import java.util.ArrayList;
import java.util.Iterator;

public class FindNumber {

	private static ArrayList al;
	public FindNumber() {
		al = new ArrayList();
	}
	
	void addNumber(int data) {
		al.add(data);
	}
	
	public static int findSecondLargest() {
		int secNum = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		Iterator it = al.iterator();
		if (it.hasNext()) {
			max = (int)it.next();
		}
		while(it.hasNext()) {
			int num = (int)it.next();
			if (num > max) {
				secNum = max;
				max = num;
			} else if (num != max && num > secNum) {
				secNum = num;
			}
		}
		return secNum;
	}
	
	public static int thirdLargest() {
		int thirdMax = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		Iterator it = al.iterator();
		if (it.hasNext()) {
			max = (int)it.next();
		}
		while(it.hasNext()) {
			int num = (int)it.next();
			if (num > max) {
				thirdMax = secMax;
				secMax = max;
				max = num;
			} else if (num != max && num > secMax) {
				thirdMax = secMax;
				secMax = num;
			} else if (num > thirdMax && num != secMax  && num != max) {
				thirdMax = num;
			}
		}
		
		return thirdMax;
	}
	
	public static void main(String[] args) {
		FindNumber fn = new FindNumber();
		fn.addNumber(1);
		fn.addNumber(1);
		fn.addNumber(2);
		/*fn.addNumber(-16);
		fn.addNumber(15);
		fn.addNumber(-16);
		fn.addNumber(14);
		fn.addNumber(12);
		fn.addNumber(1);*/
		int result = findSecondLargest();
		System.out.println(result);
		int result1 = thirdLargest();
		if (Integer.MIN_VALUE == result1) {
			System.out.println("Not present");
		} else {
		System.out.println(result1);
		}
	}

}

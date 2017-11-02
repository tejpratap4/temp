import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HakerRank {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int k = scanner.nextInt();
Math.
	    List<Integer> array = new ArrayList<Integer>(n);
	    for (int i = 0; i < n; i++) {
	        array.add(scanner.nextInt());
	    }
	    scanner.close();

	    System.out.println(getConcecutiveDiff(array, k, 1).parallelStream().findFirst().get());
	}

	private static Set<Integer> getConcecutiveDiff(List<Integer> array, int k, int value) {
	    List<Integer> indexes = allIndexForValue(array, value);
	    Set<Integer> mov = new TreeSet<Integer>();
	    for (int i = 0; i < indexes.size() - 1; i++) {
	        int diff = ((indexes.get(i + 1) - indexes.get(i)) * k) + getIndexMutipler(indexes.get(i));
	        mov.add(diff);
	    }
	    return mov;
	}

	private static int getIndexMutipler(int startIndex) {
	    return startIndex * 1;
	}

	private static List<Integer> allIndexForValue(List<Integer> array, int value) {
	    int i = 0;
	    List<Integer> index = new LinkedList<Integer>();
	    for (Integer integer : array) {
	        if (integer == value) {
	            index.add(i);
	        }
	        i++;
	    }
	    return index;
	}
}

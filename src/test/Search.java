package test;

public class Search {
	public int[] list;
	private int size;
	public Search(int size) {
		this.size = -1;
		list = new int[size];
	}
	
	public void add (int data) {
		
		this.list[++size] = data;
	}
	public void printList (){
		for (int i=0;i<this.list.length;i++) {
			System.out.print(list[i] +"-->");
		}
		System.out.println();
	}
	
	public boolean linearSearch (int data) {
		for (int i=0;i<list.length;i++) {
			if (list[i] == data) {
				//System.out.println(list[i] +"-->");
				return true;
			}
		}
		return false;
	}
	
	public boolean binerySearch (int data) {
		int low=0;
		int high = size;
		
		while (low<=high) {
			int mid = low +(high-low)/2;
			if (list[mid] == data) {
				return true;
			} else if (list[mid] > data) {
				high = mid-1;
			} else{
				low = mid+1;
			}
		}
		return false;
	}
	
	public int binerySearchlastOccur (int data, boolean forLastOccur) {
		int low=0;
		int high = size;
		int result = -1;
		while (low<=high) {
			int mid = low +(high-low)/2;
			if (list[mid] == data) {
				if(forLastOccur)
					low = mid+1;
				else // for first occur high = mid-1
					high = mid-1;
				result = mid;			
			} else if (list[mid] > data) {
				high = mid-1;
			} else{
				low = mid+1;
			}
		}
		return result;
	}
	
	public int findRotation () {
		int low=0;
		int high = size;
		int result = -1;
		
		while (low<=high) {
			int mid = low +(high-low)/2;
			if (list[low]<list[high]) {
				return low;
			} else if (list[mid] < list[(mid+size-1)%size] && list[mid] < list[(mid+1)%size]) {
				return mid;
			} else if (list[mid] >= list[low]) {
				low = mid+1;
			} else if (list[mid] <= list[high]) {
				high = mid+1;
			}
		}
		return 0;
	}
				
			
	
	public int recursiveBinerySearch (int[] list, int low, int high, int data) {		
		if (low>high) {
			return -1;
		}
		int mid = low +(high-low)/2;		
		if (list[mid] == data) {
				return mid;
		} else if ( list[mid] > data) {
			return recursiveBinerySearch (list, low,mid-1,data);
		} else {
			return recursiveBinerySearch (list, mid+1,high,data);
		}		
	}
	public static void main(String[] args) {
		Search searchNumber = new Search(10);
		searchNumber.add(9);
		searchNumber.add(10);
		searchNumber.add(20);
		searchNumber.add(30);
		searchNumber.add(40);
		searchNumber.add(50);
		
		
		searchNumber.printList();
		/*System.out.println(searchNumber.linearSearch(10));
		System.out.println(searchNumber.binerySearch(4));
		System.out.println(searchNumber.linearSearch(101));
		System.out.println(searchNumber.binerySearch(0));
		System.out.println(searchNumber.binerySearch(101));*/
		//System.out.println(searchNumber.recursiveBinerySearch(searchNumber.list, 0, 8, 6));
	/*	int firstindex = searchNumber.binerySearchlastOccur(6,false);
		if (firstindex == -1) {
			System.out.println("count -> "+0);
		} else {
			int lastIndex = searchNumber.binerySearchlastOccur(6,true);
			System.out.println("count-> "+ (lastIndex- firstindex +1));
		}*/
		
		System.out.println("rotation --> "+searchNumber.findRotation());
		
		
	}

}

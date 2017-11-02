public class Solution {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
        
        System.out.println(inputString);
      
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
	}
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a;
    a = in.nextInt();
    int b;
    b = in.nextInt();
    int sum;
    sum = solveMeFirst(a, b);
    System.out.println(sum);
}

Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[] ar = new int[n];
for(int ar_i = 0; ar_i < n; ar_i++){
    ar[ar_i] = in.nextInt();
}
int result = simpleArraySum(n, ar);
System.out.println(result);
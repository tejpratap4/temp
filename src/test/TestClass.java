package test;
import java.util.*;


class TestClass {
    
    // method to print the divisors
    static long printDivisors(long n, boolean sum)
    {
        //ArrayList<Integer> al = new ArrayList<Integer>();
        long  count = 0;
        long  m = 1;
        // Note that this loop runs till square root
        for (int i=1; i<=Math.sqrt(n)+1; i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i) {
              //      al.add(i);
                    m = m * i;
                    count += 1;
                }
                else {
               //     al.add(i);
               //     al.add(n/i);
                    m = m * i * (n/i);
                    count += 2;
                }
            }
        }
        if (sum)
            return count;
        else
            return m;
    }
    
    static long sieveOfEratosthenes(int n, int a[])
	{
		// Create a boolean array "prime[0..n]" and initialize
		// all entries it as true. A value in prime[i] will
		// finally be false if i is Not a prime, else true.
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<=n;i++)
			prime[i] = true;
		
		for(int p = 2; p*p <=n; p++)
		{
			// If prime[p] is not changed, then it is a prime
			if(prime[p] == true)
			{
				// Update all multiples of p
				for(int i = p*2; i <= n; i += p)
					prime[i] = false;
			}
		}
		long mulPrime = 1;
		// Print all prime numbers
		int j=0;;
		for(int i = 2; i <= n; i++)
		{
			if(prime[i] == true) {
				mulPrime = mulPrime * (long)Math.pow(i,a[j++]);
				System.out.println(i);
			}
		}
		return mulPrime;
	}
    
    public static void main(String args[] ) throws Exception {
       
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        long m;
        for (int i = 0; i < N; i++) {
           arr[i] = s.nextInt();
        }
        m = sieveOfEratosthenes (N,arr);
        System.out.println(m);
        long s1 = printDivisors (m, false);
        long r = printDivisors (s1, true);
        System.out.println(r);
    }
}

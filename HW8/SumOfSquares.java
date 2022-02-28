package HWEight;

public class SumOfSquares {
	
    public static int sumSquares(int n) {
    	if(n==0)
    		return 0;
	    return ((n*n)+sumSquares(n-1));
	}
	    
	public static void main(String[] args) {
	    System.out.println(sumSquares(5));
	}
}

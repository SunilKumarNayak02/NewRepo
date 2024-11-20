package developer.chap01;

public class Sum {
    public static void main(String[] args) {
		
    	int sum=0; // Initialize the sum to 0
    	       
    	         for(int i=1; i<=10;i++) {
			          sum+=i; // Add each number to the sum
			            System.out.println("Sum of the Each iteration: "+sum);
		        }
	}
}

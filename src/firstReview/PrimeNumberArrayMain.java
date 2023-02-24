package firstReview;

public class PrimeNumberArrayMain {

	
	public static void main(String[] args) {
		
		InterfacePrime obj = new PrimeImpelmentation();
		
		int[]temp = obj.storePrime();
		
		int sumTemp = obj.sum(temp);
		System.out.println("Sum of Non Prime Numbers ara: "+sumTemp);
		
	}
	
}

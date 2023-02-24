package firstReview;

public class PrimeImpelmentation implements InterfacePrime {

	@Override
	public int[] storePrime() {
		
		int[]prime=new int[25];
		int[]temp=new int[75];
		int primeCount = 0;
		int tempCount = 0;
		
		
		for(int i=2;i<=100;i++){
			boolean isPrime=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				prime[primeCount++]=i;
			}else {
				temp[tempCount++]=i;
			}
		}
		System.out.println("Prime Numbers from 1 to 100 are: ");
		for(int k=0;k<primeCount;k++) {
			System.out.print(prime[k]+" ");
		}
		System.out.println();
		
		System.out.println("Non Prime Numbers are:");
		for(int q=0;q<tempCount;q++) {
			System.out.print(temp[q]+" ");
		}
		System.out.println();
		
		return temp;
	}

	@Override
	public int sum(int[] temp) {
		int sum =0;
		for(int i=0;i<temp.length;i++) {
			sum = sum+temp[i];
		}
		return sum;
		
	}

	
}

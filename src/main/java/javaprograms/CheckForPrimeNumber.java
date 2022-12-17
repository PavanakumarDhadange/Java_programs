package javaprograms;

public class CheckForPrimeNumber {

	public static void main(String[] args) {
		
		int number = 113;
		int i=2;
		boolean isPrimeNumber = true;
		
		if(number<i) {
			isPrimeNumber = false;
		}
		
		while(number>=i) {
			if(number==i) {
				isPrimeNumber = true;
				break;
			}
			if(number%i==0) {
				System.out.println("Number is divided by "+i);
				isPrimeNumber = false;
				break;
			}
			i++;
		}
		
		
		if(isPrimeNumber) {
			System.out.println("Given number is prime number..");
		} else {
			System.out.println("Given number is not prime number..");
		}
	}
	
}

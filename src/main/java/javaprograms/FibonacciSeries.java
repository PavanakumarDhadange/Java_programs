package javaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int numberOfValuesInSeries = 1000;
		
		Long firstValue = 0l;
		Long secondValue = 1l;
		print(firstValue);
		print(secondValue);
		int count = 2;
		while (numberOfValuesInSeries>=count) {
			
			long nextValue = firstValue+secondValue;
			firstValue = secondValue;
			secondValue = nextValue;
			print(nextValue);
			count ++;
		}
		
	}
	
	public static void print(long value) {
		System.out.print(value+" ");
	}
	
}

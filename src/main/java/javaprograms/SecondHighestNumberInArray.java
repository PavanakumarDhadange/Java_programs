package javaprograms;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		
		int[] numbers = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89, 99 }; 
		
		int highestNum = 0;
		int secondHighestNum = 0;
		
		for(int num: numbers) {
			if(num > highestNum) {
				secondHighestNum = highestNum;
				highestNum = num;
			} else if(num > secondHighestNum) {
				secondHighestNum = num;
			}
		}
		System.out.println("Highest number = "+highestNum);
		System.out.println("Second Highest number = "+secondHighestNum);
		
	}
	
}

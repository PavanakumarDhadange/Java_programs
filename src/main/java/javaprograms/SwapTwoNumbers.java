package javaprograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int firstNum = 10, secondNum = 30;
		
		// This example is without using third variable
		
		System.out.println("Before Swap FirstNum="+firstNum+" SecondNum="+secondNum);
		
		firstNum = firstNum + secondNum; 	// 10+30 = 40
		secondNum = firstNum - secondNum;	// 40-30 = 10
		firstNum = firstNum - secondNum;	// 40-10 = 30
		
		System.out.println("After Swap FirstNum="+firstNum+" SecondNum="+secondNum);
		
	}
	
}

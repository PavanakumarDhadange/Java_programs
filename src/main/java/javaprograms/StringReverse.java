package javaprograms;

public class StringReverse  {
	
	public static final String INPUTSTRING = "Hello World";
	
	public static void main(String[] args) {
		System.out.println(reverseStringUsingInBuildMethod());
		System.out.println(reverseStringWithoutUsingInBuildMethod());
		System.out.println(reverseStringWithoutUsingInBuildMethod2());
		System.out.println(reverseStringWithoutUsingInBuildMethod3());
	}
	
	public static String reverseStringUsingInBuildMethod() {
		
		StringBuilder builder = new StringBuilder(INPUTSTRING);
		
		return builder.reverse().toString();
	}
	
	public static String reverseStringWithoutUsingInBuildMethod() {
		
		String reverseString = "";
		char[] inputStringChars = INPUTSTRING.toCharArray();
		for(int i=inputStringChars.length-1; i>=0; i--) {
			reverseString = reverseString + String.valueOf(inputStringChars[i]);
		}
		return reverseString;
	}
	
	public static String reverseStringWithoutUsingInBuildMethod2() {
		
		String reverseString = "";
		String[] inputStringChars = INPUTSTRING.split("");
		for(int i=inputStringChars.length-1; i>=0; i--) {
			reverseString = reverseString + String.valueOf(inputStringChars[i]);
		}
		return reverseString;
	}
	
	public static String reverseStringWithoutUsingInBuildMethod3() {
		
		String reverseString = "";
		for(int i=INPUTSTRING.length()-1; i>=0; i--) {
			reverseString = reverseString + String.valueOf(INPUTSTRING.charAt(i));
		}
		return reverseString;
	}
	
}
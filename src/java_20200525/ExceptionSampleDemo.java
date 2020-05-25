package java_20200525;

public class ExceptionSampleDemo {
	public static void main(String[] args) {
		//String msg = null;
		//int msgLength = msg.length();
		// NullPointerException 예외 발생
		//System.out.println(msgLength);
	
		//int[] array = {1,2,3};
		// ArrayIndexOutOfBoundsException 예외 발생
		//int temp = array[3];
		
		//int result = 3/0;
		// ArithmeticException 예외 발생
		//System.out.println(result);
				
		int first = Integer.parseInt("a");
		//NumberFormatException 예외 발생
		System.out.println(first);

		
		
	}
}

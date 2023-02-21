package sampleprograms;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.print("program execution start");
		int fNumber =5;
		int sNumber =0;
		int result = 1;
		
		try {
			result = fNumber/sNumber;
		}
		catch (ArithmeticException ae){
			System.out.println(ae.toString());
//			throw ae;
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("output is: "+result);
		System.out.println("program execution end");
	}

}

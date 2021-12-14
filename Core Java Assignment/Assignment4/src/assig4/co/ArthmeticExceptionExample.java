package assig4.co;

public class ArthmeticExceptionExample {

	public static void main(String[] args) {
		try {
			int num1=25,num2=0;
			int output=num1/num2;
			System.out.println("Output is: "+output);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero error");
			
		}
	}

}

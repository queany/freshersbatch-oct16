package assig1.co;
import java.util.*;

public class SimpleCompound {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the principal:");
		double principal=input.nextDouble();
		System.out.println("Enter the rate:");
		double rate=input.nextDouble();
		System.out.println("Enter the time:");
		double time=input.nextDouble();
		double intrest=(principal*time*rate)/100;
		double compoundintrest=principal*(Math.pow((1+rate/100),time));
		System.out.println("Simple intrest is:"+intrest);
		System.out.println("Compound intrest is:"+compoundintrest);

	}

}

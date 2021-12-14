package assig1.co;
import java.util.*;

public class PassorFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks of subject1:");
	int mark1=sc.nextInt();
	System.out.println("Enter the marks of subject2:");
	int mark2=sc.nextInt();
	System.out.println("Enter the marks of subject3:");
	int mark3=sc.nextInt();
	if((mark1>=60)&&(mark2>=60)&&(mark3>=60)){
		System.out.println("Passed");
	}
	else {
		System.out.println("Fail");
	}
	
		
	}

}

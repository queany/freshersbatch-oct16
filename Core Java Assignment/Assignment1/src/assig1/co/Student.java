package assig1.co;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks for student1 with subject A:");
		int A=sc.nextInt();
		System.out.println("Enter the marks for student1 with subject B:");
		int B=sc.nextInt();
		System.out.println("Enter the marks for student1 with subject C:");
		int C=sc.nextInt();
		System.out.println("Enter the marks for student2 with subject A:");
		int A1=sc.nextInt();
		System.out.println("Enter the marks for student2 with subject B:");
		int B1=sc.nextInt();
		System.out.println("Enter the marks for student2 with subject C:");
		int C1=sc.nextInt();
		
		System.out.println("Enter the marks for student3 with subject A:");
		int A2=sc.nextInt();
		System.out.println("Enter the marks for student3 with subject B:");
		int B2=sc.nextInt();
		System.out.println("Enter the marks for student3 with subject C:");
		int C2=sc.nextInt();
		
		int Total1=(A+B+C);
		System.out.println("The total of all the three subjects for student1: "+Total1);
		int Average1=Total1/3;
		
		
		int Total2=(A1+B1+C1);
		System.out.println("The total of all the three subjects for student2: "+Total2);
		int Average2=Total2/3;
		
		int Total3=(A2+B2+C2);
		System.out.println("The total of all the three subjects for student3: "+Total3);
		int Average3=Total3/3;
		
	}

}

package assig1.co;
import java.util.*;

public class Searching {

	public static void main(String[] args) {
		int []arr= {1,2,7,4,0,7,14,26,25,56,11,23,15,78,47};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to search:");
		int tocheckValue=sc.nextInt();
		boolean found=false;
		for(int element:arr) {
			if(element==tocheckValue) {
				found=true;
				break;
		}

	}
	if(found) {
		System.out.println("The element" +tocheckValue+" is present in the array");
	}
	else {
		System.out.println("The element" +tocheckValue+"is not present in the array");
	}
		

}
}
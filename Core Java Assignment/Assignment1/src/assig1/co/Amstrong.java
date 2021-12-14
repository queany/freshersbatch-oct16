package assig1.co;

public class Amstrong {

	public static void main(String[] args) {
		int num=153, originalNum,remainder,result=0;
		originalNum=num;
		while(originalNum!=0)
		{
			remainder=originalNum%10;
			result=result+remainder*remainder*remainder;
			originalNum/=10;
			
		}
		if(result==num) {
			System.out.println(num+ " "+"is a Amstrong number");
		}
		else {
			System.out.println(num +" "+ "is not a  Amstrong number");
		}

	}

}

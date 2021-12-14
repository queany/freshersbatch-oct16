package assig1.co;

public class AmstrongRange {

	public static void main(String[] args) {
		for(int num=100;num<=1000;num++) {
			int temp=num;
			int remainder=0;
			int result=0;
			while(temp>0) {
				remainder=temp%10;
				result=result+remainder*remainder*remainder;
				temp=temp/10;
			}
			if(num==result) {
			System.out.println(num + "is Amstrong number");
			
		}
		
		}
	}
}


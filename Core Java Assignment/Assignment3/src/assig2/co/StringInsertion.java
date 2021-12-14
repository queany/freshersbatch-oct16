package assig2.co;

public class StringInsertion {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("It is used to _ at the specified index position");
		System.out.println("The string before insertion: "+str);
		str.insert(15, "insert text");
		System.out.println("The string after insertion: "+str);
		
		
		

	}

}

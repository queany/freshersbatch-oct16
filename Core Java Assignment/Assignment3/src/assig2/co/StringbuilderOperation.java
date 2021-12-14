package assig2.co;

public class StringbuilderOperation {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		String s1="StringBuilder";
		String s2="is a peer class of string ";
		String s3="that provides much of the ";
		String s4="functionality of strings";
		sb.append(s1);
		sb.append(s2);
		sb.append(s3);
		sb.append(s4);
		System.out.println("The string after appending: "+sb);
		
		StringBuilder str= new StringBuilder("It is used to _ at the specified index position");

		System.out.println("The string before insertion: "+str);
		str.insert(15, "insert text");
		System.out.println("The string after insertion: "+str);
		
		
		StringBuilder sb2=new StringBuilder("The method returns the reversed object on which it was called");
		
		System.out.println("The string before reversing: "+sb2);
		System.out.println("The string after reversing: "+sb2.reverse());
	}

}

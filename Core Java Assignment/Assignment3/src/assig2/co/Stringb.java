package assig2.co;

public class Stringb {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("StringBuffer");
		String s2="is a peer class of string ";
		String s3="that provides much of the ";
		String s4="functionality of strings";
		sb.append(s2);
		sb.append(s3);
		sb.append(s4);
		System.out.println("The string after appending: "+sb);
	}

}

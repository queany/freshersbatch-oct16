package assig2.co;

public class StringBufferReverse {

	public static void main(String[] args) {
		StringBuffer st=new StringBuffer("The method returns the reversed object on which it was called");
		System.out.println("The string before reversing: "+st);
		System.out.println("The string after reversing: "+st.reverse());
	}

}

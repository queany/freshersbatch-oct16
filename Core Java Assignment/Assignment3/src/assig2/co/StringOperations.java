package assig2.co;

public class StringOperations {

	public static void main(String[] args) {
		String s1="Java String pool refers to the collection of String which are stored in heap memory";
	String s1lower=s1.toLowerCase();
	System.out.println("The string in the lowercase: "+s1lower);
	String s1upper=s1.toUpperCase();
	
	System.out.println("The string in the uppercase: "+s1upper);
	String replaceString=s1.replace('a','$');
	System.out.println("Replacing a by $: "+replaceString);
	System.out.print("If s1 contains the word collection:");
	System.out.println(s1.contains("collection"));
	String s2="java string pool refers to the collection of string which are stored in heap memory";
	System.out.print("s1 matches s2:");
	System.out.println(s1.matches(s2));
	System.out.print("If the strings are equal:");
	System.out.println(s1.equalsIgnoreCase(s2));
	
	
	
	}

}

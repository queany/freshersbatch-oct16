package ass2.co;

public class Singleton {
	private static  Singleton single_instance=null;
	public String s;
	private Singleton()
	{
		s="Hello I am string part of singleton class";
		
	}
	public static Singleton getInstance() {
		if( single_instance==null)
			single_instance=new Singleton();
		return single_instance;
	}
	public static void main(String[] args) {
		Singleton x=Singleton .getInstance();
		
		System.out.println("Hashcode of x: "+x.hashCode());
		
	}

}

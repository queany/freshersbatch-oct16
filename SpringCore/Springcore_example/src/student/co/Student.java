package student.co;

public class Student {
	private String name;
	@Override
	public String toString() {
		return "Person [name=" + name + ", phno=" + phno + ", email=" + email + "]";
	}

	private long phno;
	private String email;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}

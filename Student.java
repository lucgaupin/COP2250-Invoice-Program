
public class Student {
	private String sName;
	private int sAge;
	
	public Student(String sName, int sAge) {
		super();
		this.sName = sName;
		this.sAge = sAge;
	}

	public void setSName(String n) {
		this.sName = n;
	}
	
	public void setSAge(int a) {
		this.sAge = a;
	}
	
	public String getSName() {
		return this.sName;
	}
	
	public int getSAge() {
		return this.sAge;
	}
	
	// TOSTRING() METHOD TO RETURN THE VALUES SET BY THE USER
	@Override
	public String toString() {
		return "Student.....: " + sName;
	}
	
	
}

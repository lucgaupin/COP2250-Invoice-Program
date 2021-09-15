
class Teacher {
	private String tName;
	private float hoursTaught;
	private float maxHours = 40;
	
	// THIS IS THE CONSTRUCTOR TO SET A VALUE TO THE TEACHERS NAME. WERE GOING TO ASSUME THAT HIS NAME IS AS FOLLOWS...
	public Teacher() {
		tName = "Claude Mitchell";
	}
	
	public void setTName(String n) {
		this.tName = n;
	}

	public void setHoursTaught(float t) {
		this.hoursTaught = t;
		
		if(t > maxHours) {
			System.out.println("\nTUTOR OVERWORKED THIS WEEK!");
			return;
		}
	}
	
	// THIS SETS THE VALUE OF MAXHOURS TO M, SO WE CAN CALL A SINGLE VALUE AND MAKE IT EASIER RATHER THAN CALLING THE WHOLE VARIABLE
	public void setMaxHours(float m) {
		this.maxHours = m;
	}
	
	public String getTName() {
		return this.tName;
	}

	public float getHoursTaught() {	
		return this.hoursTaught;
	}
	
	public float getMaxHours() {
		return this.maxHours;
	}

	// TOSTRING() METHOD TO OUTPUT THE USER INPUTS
	@Override
	public String toString() {
		return "Teacher.....: " + tName + "\n" + "Hours taught: " + hoursTaught;
	}
}

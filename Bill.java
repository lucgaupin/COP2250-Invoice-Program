public class Bill {
	private float hourlyRate;
	
	public Bill(float hourlyRate) {
		super();
		this.hourlyRate = hourlyRate;
	}

	public void setHourlyRate(float h) {
		this.hourlyRate = h;
	}

	public float getHourlyRate() {
		return this.hourlyRate;
	}
}

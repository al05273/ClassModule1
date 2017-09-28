
public abstract class Person {
	private String name;
	private int ssn;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String toString() {
		return getName();
	}
	
	public abstract void sayMyName();

}

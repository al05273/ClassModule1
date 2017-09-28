
public class Staff extends Person{
	private  String dept;
	private int office;
	public Staff(String name, int ssn) {
		setName(name);
		setSsn(ssn);
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getOffice() {
		return office;
	}
	public void setOffice(int office) {
		this.office = office;
	}
	
	public String toString() {
		return getName() + " works in the " +getDept() + " Department, office number " + getOffice();
	}
	
	public void sayMyName() {
		System.out.println(getName());
	}
}

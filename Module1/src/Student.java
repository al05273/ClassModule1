
public class Student extends Person {
	private int eid;
	private String[] courseList;
	public Student (String name, int ssn, int eid) {
		setName(name);
		setSsn(ssn);
		this.eid = eid;
		courseList = new String[10];	
	}
	
	public void setCourse(String course) {
		this.courseList[0] = course;
		
	}
	public void setCourse(String[] cList) {
		this.courseList = cList;
		
	}
	public String printCList() {
		String list = "";
		for(int i = 0; i<this.courseList.length;i++) {
			String temp=this.courseList[i];
			if (temp!= null) {
				list += temp;
			}
		}
		return list;
	}
	
	public String toString() {
		
		return getName()+" "+this.eid+" " +printCList();
	}
	
	public void sayMyName() {
		System.out.println(getName());
	}
}

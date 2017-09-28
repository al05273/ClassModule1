import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyCollegeTester {

	public static void main(String[] args){
		Student mary = new Student("Mary", 101010101, 900001);
		mary.setCourse("Under Water Basket weaving");
		System.out.println(mary);
		
		Staff admin = new Staff("Bugs Bunny", 123);
		admin.setDept("Computer Science");
		admin.setOffice(54321);
		System.out.println(admin);
		
		Person p = admin;
		p = new Staff("Daffy Duck", 567);
		
		admin = (Staff) p;
		Person [] college = new Person[3];
		college[0] = p;
		college[1] = mary;
		college[2] = admin;
		for(int i = 0; i<college.length; i++) {
			if (college[i] instanceof Student) {
				System.out.println(((Student) college[i]).printCList());
			}else { System.out.println(((Staff) college[i]).getDept());
			}
		}
		// Using polymorphic interfaces
	Set s = new TreeSet<Person>();
	s.add(admin);
	s.add(mary);
	System.out.println(s.size());
	}
		
	
	
}


public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("Bob");
		Person p2 = new Person();
		p2.setName("Mary");
		
		System.out.println("p1's name is " + p1.getName() + " and p2's name is " +p2.getName());
		
		//primitive types
		int x = 10;
		int y = 20;
		int z = x+y;
		System.out.println("x is " + x + ", y is " +y+", z is "+z);
		y = x;
		System.out.println("x is " + x + ", y is " +y+", z is "+z);
		
		
		p2 = p1;
		System.out.println("p1's name is " + p1.getName() + " and p2's name is " +p2.getName());
		
		p1.setName("Bobby");
		
	}
	

}

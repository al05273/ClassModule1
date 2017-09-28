
public class MyStringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		String ex1 = new String("Mary has a little lamb");
		String ex2 = "Mary has a little lamb";
		System.out.println("Are ex1 and ex2 at the same memory location? " +(ex1==ex2));
		String ex3 = "Mary has a little lamb";
		System.out.println("Are ex3 and ex2 at the same memory location? " +(ex3==ex2));

	}

}

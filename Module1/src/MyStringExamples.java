
public class MyStringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		String ex1 = new String("Mary has a little lamb");
		String ex2 = "Mary has a little lamb";
		System.out.println("Are ex1 and ex2 at the same memory location? " +(ex1==ex2));
		String ex3 = "Mary has a little lamb";
		System.out.println("Are ex3 and ex2 at the same memory location? " +(ex3==ex2));
		System.out.println("Is the text in ex1 the same as ex2 "
				+ "" + ex1.equals(ex2));
		System.out.println("Is the text in ex1 the same as ex2 "
				+ "" + ex1.compareTo(ex2));
		
		System.out.println("Length of ex3 is "+ ex3.length());
		System.out.println("The character at index 15 of ex2 is " + ex2.charAt(15));
		System.out.println("The substring between 0 and 15 is " + ex2.substring(15));
		
		System.out.println(ex3.toUpperCase());
		System.out.println(ex3.replaceAll("a", "0"));
		
		System.out.println("123-456-7890".matches("\\d{3}-\\d{3}-\\d{4}"));
		
		
	}

}

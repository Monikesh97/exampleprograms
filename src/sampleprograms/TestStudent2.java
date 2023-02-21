package sampleprograms;

//initialization_by_reference_variable
class Student2 {
	int id;
	String name;
}

public class TestStudent2 {
	public static void main(String args[]) {
		Student2 s1 = new Student2();
		s1.id = 903; // Initialization
		s1.name = "Moni"; // Initialization
		System.out.println(s1.id + " " + s1.name); // printing members with a white space
	}
}
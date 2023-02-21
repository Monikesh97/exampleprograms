package sampleprograms;

//single Inheritance
class Animal{
	void eat(){
	System.out.println("animal eating");
	}
}
class dog3 extends Animal{
	void bark() {
		System.out.println("dog3 barking");
	}
}

public class TestInheritance1 {

	public static void main(String[] args) {
		dog3 D=new dog3();
		D.bark();
		D.eat();
		
		
	}

}

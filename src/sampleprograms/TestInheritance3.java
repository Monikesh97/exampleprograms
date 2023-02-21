package sampleprograms;
//this is hierarical inheritance

class Animal2{
	void eat() {
		System.out.println("I am eating ");
	}
}
class dog1 extends Animal2{
	void bark(){
		System.out.println("dog is barking");
	}
}
class cat extends dog1{
	void meow(){
		System.out.println("cat shouts meow");
		
	}
}
public class TestInheritance3 {

	public static void main(String[] args) {
		cat cat = new cat();
		cat.meow();

	}

}

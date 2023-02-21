package sampleprograms;
//this is multilevel inheritance
class Animal1{
	void eat() {
		System.out.println("animal will eating");
	}
}
class dog extends Animal1{
	void bark() {
		System.out.println("animal is barking");
	}
}
class babydog extends dog {
	void  weep() {
		System.out.println("dog is weeping");
	}
}
public class TestInheritance2 {

	public static void main(String[] args) {
		babydog babydog = new babydog();
		babydog.weep();
		babydog.bark();
		}

	}



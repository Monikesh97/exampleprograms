package exampleprograms;

abstract class RBIBank2{
	abstract float rateOfInterest();
	
}

 class SBI2 extends RBIBank2{

	float rateOfInterest() {

		return 8.85f;
	}
	
}

class PNB2 extends RBIBank2{
	
	float rateOfInterest() {
		return 9.15f;
	}
}


public class TestAbstarctClass {

	public static void main(String[] args) {

		
		RBIBank2 sbi2 = new SBI2();
		RBIBank2 PNB2 = new PNB2();
		System.out.println(sbi2.rateOfInterest());
		System.out.println(PNB2.rateOfInterest());
		


	}

}

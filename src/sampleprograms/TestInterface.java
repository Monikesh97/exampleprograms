package sampleprograms;

interface RBIBank {
	float RateOfInterest();
}

class SBIBank implements RBIBank {
	public float RateOfInterest() {
		return 7.5f;

	}
}

class PNBBank implements RBIBank {
	public float RateOfInterest() {
		return 8.5f;
	}
}

public interface TestInterface {
	public static void main(String[] args) {
		RBIBank sbiBank = new SBIBank();
		RBIBank pnBank = new PNBBank();
		System.out.println(sbiBank.RateOfInterest());
		System.out.println(pnBank.RateOfInterest());

	}

}

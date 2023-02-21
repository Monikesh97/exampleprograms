   package exampleprograms;

public class OddNumber {
	public static void main(String[] args) {
		OddNumber on= new OddNumber();
		on.CheckOddOrEven(15);
		
		}
		
	public void CheckOddOrEven(int number)
	{
		if(number % 2==0)
		{
	    System.out.println("EvenNumber");
		}
        else
		{
		System.out.println("OddNumber");
		}
	
	}

	
			
	 
	
}

package sampleprograms;

abstract class Bank {
	abstract float getRateOfInterest();
}

class SBI extends Bank {
float getRateOfInterest() {
  return 7.58f;   
}
}

class PNB extends Bank {
float getRateOfInterest() {
return 8.59f;  
}
}

class TestBank{    
public static void main(String args[]){    
Bank b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %"); 

}
}

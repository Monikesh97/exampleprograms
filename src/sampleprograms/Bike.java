package sampleprograms;

	public abstract class Bike{  
		  abstract void run();  
		}  
		class Honda4 extends Bike{  
		void run() {
		}
		public static void main(String args[]){
		System.out.println("running safely..");  
		 Bike obj = new Honda4();  
		 obj.run();  
		}  
		}

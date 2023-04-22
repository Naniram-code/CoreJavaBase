package ClassDemoCode;



public class StaticVariable_NonStaticVar {

	
		int a=10;
		static int b=900;

		static 
		{
			System.out.println("Hi i am static block");// always execute static block then main method 
		}
		
		public static void main(String[] args) {
			
			StaticVariable_NonStaticVar Cobj=new StaticVariable_NonStaticVar();
			staticMethod(); // we can assessed static method directly in static method 
		
	      System.out.println(Cobj.a);// non static or instance veritable assessed by class instance 
	      System.out.println(b);     // static variable can assessed directly inside static method
	      b=10000;
	  	
	      StaticVariable_NonStaticVar Cobj1=new StaticVariable_NonStaticVar();
	      
	      System.out.println(b);
	      System.out.println(Cobj1.a);
	      
	      StaticVariable_NonStaticVar bbb= null;
	      System.out.println(Cobj.b);
	   
	     }
	     
	     static void staticMethod() {
	         System.out.println("Static method executed.");
	     }
	         
		}



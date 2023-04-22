package ClassDemoCode;


public class DayThree {
	//non static variable
	
   static int svar=20;
   int fno;
   int sno;
   int result; 
   
	 void display() {
		//non-static variables can access directly from non-static Methods 
		 fno=500;
		 sno=300;
	     result=fno-sno;
		System.out.println("Result using non static variable="+result);
				 
	 }

	 void localVariableDemo() {
		
		 //Local variables 
		 int fno=500;
		 int sno=300;
	     result=fno-sno;
		System.out.println("Result from local Variable ="+result);
				 
	 }
	
	public static  void main(String []args)
	
	{  
	  DayThree obj=new DayThree();
       obj.display();
	   obj.localVariableDemo();
	   
	   System.out.println("non static variable accessed by object inside static method="+obj.result);
	   System.out.println("Static Variable can accessed directly in staice method="+svar);
	    
	}
}


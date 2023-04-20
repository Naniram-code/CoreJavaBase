package ClassDemoCode;


public class DayThree {
	//non static variable
	
    static int svar=20;
   int fno;
   int sno;
   int result; 
   
	 void display() {
		//non-static varibles can acccess directly from non-static Methods 
		 fno=500;
		 sno=300;
	     result=fno-sno;
		System.out.println("Result="+result);
				 
	 }
	
	
	public static  void main(String []args)
	
	{
	   DayThree obj=new DayThree();
	   
	   obj.display();
	   
	   System.out.println("non static variable accessed by object inside static method="+obj.result);
	   System.out.println("Static Variable can accessed directly in staice method="+svar);
	    
	}
}


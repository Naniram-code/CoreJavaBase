package ClassDemoCode;

public class Demo2 {

	  static int Result;
	   int fno;
	   int sno;
	 
	   void AdditionTwoNumber() {
			
	   fno=500;
	   sno=300;
	   System.out.println("Addition of Two Number="+(Demo2.Result=fno+sno));}
					 
		                          

	  void SubtractionTwoNumber() {
			
	   int fno=1500;
	   int sno=1000;
	   System.out.println("Subtraction of Two Number="+(Demo2.Result=fno-sno));}
					 
	public static  void main(String []args) {
	       
		    Demo2 Cobj=new Demo2();
	        Cobj.AdditionTwoNumber();
		    Cobj.SubtractionTwoNumber();}
		    
		     
	}


package ClassDemoCode;

public class Addition_Subtraction {

	 
	    void addition(int a, int b) {

	         int add=a+b;
			 System.out.println("Addition="+add);
					 
		 }

		 void subtraction(int a, int b) {
			
			 int sub=a-b;
			System.out.println("Sbtraction ="+sub);
					 
		 }
		
		public static  void main(String []args)
		
		{  
			Addition_Subtraction obj=new Addition_Subtraction();
	       obj.addition(500,300);
		   obj.subtraction(500,300);
		   
		    }}

package Assignment;

public class StatickBlock {
	int a=10;
	static int b=900;

	static 
	{
		System.out.println("Hi i am static block");// always execute static block then main method 
	}
	
	public static void main(String[] args) {
		StatickBlock bb=new StatickBlock();
		
		  
	
      System.out.println(bb.a);
      System.out.println(b);
      b=10000;
      System.out.println(b);
      System.out.println(bb.a);
      StatickBlock bbb= null;
      
      //System.out.println(bbb.a);
      System.out.println(bbb.b);
      System.out.println("Static method executed."); 
      System.out.println("Static method executed.");
      
      
      
	}
     
     static void staticMethod() {
         System.out.println("Static method executed.");
     }
         
	

}

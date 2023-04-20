package Assignment;

public class StatickBlock {

	static 
	{
		System.out.println("Hi i am static block");// always execute static block then main method 
	}
	
	public static void main(String[] args) {
		  
	  staticMethod();
      System.out.println("Hi am main Method ");
	}
     
     static void staticMethod() {
         System.out.println("Static method executed.");
     }
         
	

}
